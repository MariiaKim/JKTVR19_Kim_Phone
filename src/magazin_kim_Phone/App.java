
package magazin_kim_phone;


import tools.savers.CustomersStorageManager;
import tools.creaters.CustomerManager;
import entity.Customer;
import entity.Phone;
import entity.History;
import entity.User;
import java.util.GregorianCalendar;
import java.util.Scanner;
import security.SecureManager;
import tools.creaters.PhoneManager;
import tools.savers.PhonsStorageManager;
import tools.savers.HistoriesStorageManager;
import tools.creaters.UserCardManager;
import tools.savers.UsersStorageManager;
import ui.UserInterface;



public class App {
    private Scanner scanner = new Scanner(System.in);
    private Customer[] customers = new Customer[20];
    private Phone[] phons = new Phone[20];
    private History[] histories = new History[20];
    private User[] users = new User[20];
    private CustomersStorageManager readersStorageManager = new CustomersStorageManager();
    private PhonsStorageManager phonsStorageManager = new PhonsStorageManager();
    private HistoriesStorageManager historiesStorageManager = new HistoriesStorageManager();
    private UsersStorageManager usersStorageManager = new UsersStorageManager();
    public static User loggedInUser;
    public App() {
        Customer[] loadedCustomers = readersStorageManager.loadCustomersFromFile();
        if(loadedCustomers != null){
            customers = loadedCustomers;
        }
        Phone[] loadedPhons = phonsStorageManager.loadPhonsFromFile();
        if(loadedPhons != null){
            phons = loadedPhons;
        }
        History[] loaderHistories = historiesStorageManager.loadHistoriesFromFile();
        if(loaderHistories != null){
            histories = loaderHistories;
        }
        User[] loaderUser = usersStorageManager.loadUsersFromFile();
        if(loaderUser != null){
            users = loaderUser;
        }
    }
    public void run() {
        System.out.println("--- Магазин ---");
        SecureManager secureManager = new SecureManager();
        App.loggedInUser = secureManager.checkInLogin(users,customers);
        UserInterface userInterface = new UserInterface();
        
        if("MANAGER".equals(App.loggedInUser.getRole())){
            //публикуем интерфейс менеджера
            userInterface.printManagerUI(users, customers, phons, histories);
        }else if("CUSTOMER".equals(App.loggedInUser.getRole())){
            //публикуем интерфейс заказчика
            userInterface.printManagerUI(users, customers, phons, histories);
        }
    }

}