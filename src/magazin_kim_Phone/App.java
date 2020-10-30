
package magazin_kim;


import tools.savers.CustomersStorageManager;
import tools.creaters.CustomerManager;
import entity.Customer;
import entity.Phone;
import entity.History;
import java.util.GregorianCalendar;
import java.util.Scanner;
import tools.creaters.PhoneManager;
import tools.savers.PhonsStorageManager;
import tools.savers.HistoriesStorageManager;
import tools.creaters.UserCardManager;



public class App {
    private Scanner scanner = new Scanner(System.in);
    private Customer[] customers = new Customer[20];
    private Phone[] phons = new Phone[20];
    private History[] histories = new History[20];

    public App() {
        CustomersStorageManager rsm = new CustomersStorageManager();
        Customer[] loadedCustomers = rsm.loadCustomersFromFile();
        if(loadedCustomers != null){
            customers = loadedCustomers;
        }
        PhonsStorageManager bsm = new PhonsStorageManager();
        Phone[] loadedPhons = bsm.loadPhonsFromFile();
        if(loadedPhons != null){
            phons = loadedPhons;
        }
        HistoriesStorageManager historiesStorageManager = new HistoriesStorageManager();
        History[] loaderHistories = historiesStorageManager.loadHistoriesFromFile();
        if(loaderHistories != null){
            histories = loaderHistories;
        }
    }

    public void run() {
        System.out.println("--- Магазин ---");
        boolean repeat = true;
        do{
            System.out.println("=============================");
            System.out.println("Задачи:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить телефон");
            System.out.println("2. Список всех телефонов в наличии");
            System.out.println("3. Добавить заказчика");
            System.out.println("4. Список заказчиков");
            System.out.println("5. Оформить заказ телефона");
            System.out.println("6. Отмена заказа");
            System.out.println("7. Список проданных телефонов");
            System.out.print("Выберите задачу: ");
            String task = scanner.nextLine();
            System.out.println("=============================");
            switch (task) {
                case "0":
                    System.out.println("--- конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("---  Добавить товар ---");
                    PhoneManager phoneManager = new PhoneManager(); 
                    Phone phone = phoneManager.addPhone();
                    for (int i = 0; i < phons.length; i++) {
                        if(phons[i] == null){
                            phons[i] = phone;
                            break;
                        }
                    }
                    PhonsStorageManager phonsStorageManager = new PhonsStorageManager();
                    phonsStorageManager.savePhonsToFile(phons);
                    break;
                case "2":
                    System.out.println("--- Список телефонов в наличии ---");
                    
                    int j = 0;
                    for (Phone b : phons) {
                        if(b != null){
                            System.out.println(j+1+". "+b.toString());
                            j++;
                        }
                    }
                    break;
                case "3":
                    System.out.println("--- Добавить заказчика ---");
                    CustomerManager customerManager = new CustomerManager(); 
                    Customer customer = customerManager.addCustomer();
                    for (int i = 0; i < customers.length; i++) {
                        if(customers[i] == null){
                            customers[i] = customer;
                            break;
                        }
                    }
                    CustomersStorageManager customersStorageManager = new CustomersStorageManager();
                    customersStorageManager.saveCustomersToFile(customers);
                    break;
                case "4":
                    System.out.println("--- Список заказчиков ---");
                    int n = 0;
                    for (Customer r : customers) {
                        if(r != null){
                            System.out.println(n+1+". "+r.toString());
                            n++;
                        }
                    }
                    break;
                case "5":
                    System.out.println("--- Оформить заказ телефона ---");
                    UserCardManager userCardManager = new UserCardManager();
                    History history = userCardManager.givePhons(phons, customers);
                    for (int i = 0; i < histories.length; i++) {
                        if(histories[i] == null){
                            histories[i] = history;
                            break;
                        }
                    }
                    HistoriesStorageManager historiesStorageManager = new HistoriesStorageManager();
                    historiesStorageManager.saveHistoriesToFile(histories);
                    break;
                case "6":
                    System.out.println("--- Отмена заказа ---");
                    userCardManager = new UserCardManager();
                    userCardManager.returnPhons(histories);
                    historiesStorageManager = new HistoriesStorageManager();
                    historiesStorageManager.saveHistoriesToFile(histories);
                    break;
                case "7":  
                    System.out.println("--- Список проданных телефонов ---");
                    n = 0;
                    for (History h : histories) {
                        if(h != null && h.getReturnDate() == null){
                            System.out.println(n+1+". "+h.toString());
                            n++;
                        }
                    }
                    break;
                default:
                    System.out.println("Нет такой задачи");;
            }
        }while(repeat);
    }

}