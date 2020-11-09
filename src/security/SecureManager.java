
package security;

import entity.Customer;
import entity.User;
import java.util.Scanner;
import tools.creaters.CustomerManager;
import tools.creaters.UserManager;
import tools.savers.CustomersStorageManager;
import tools.savers.UsersStorageManager;


public class SecureManager {
private Scanner scanner = new Scanner(System.in);
private UserManager userManager = new UserManager();
private CustomerManager customerManager = new CustomerManager();
private UsersStorageManager usersStorageManager = new UsersStorageManager();
private CustomersStorageManager customersStorageManager = new CustomersStorageManager();

    public User checkInLogin(User[] users, Customer[] customers) {
        do{
            System.out.println("Ваш выбор: ");
            System.out.println("0. Закрыть программу");
            System.out.println("1. Регистрация");
            System.out.println("2. Вход в систему");
            System.out.print("Введите номер задачи: ");
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("Head aega! :)");
                    System.exit(0);
                    break;
                case "1":
                    User user = userManager.createUser();
                    userManager.addUserToArray(user, users);
                    customerManager.addCustomerToArray(user.getCustomer(), customers);
                    customersStorageManager.saveCustomersToFile(customers);
                    usersStorageManager.saveUsersToFile(users);
                    break;
                case "2":
                    User checkInUser = userManager.getCheckInUser(users);
                    if(checkInUser == null) break;
                    return checkInUser;
                default:
                    System.out.println("Нет такой задачи.");;
            }
        }while(true);
    }
    
}