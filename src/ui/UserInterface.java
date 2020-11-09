
package ui;

import entity.Phone;
import entity.History;
import entity.Customer;
import entity.User;
import java.util.Scanner;
import tools.creaters.PhoneManager;
import tools.creaters.CustomerManager;
import tools.creaters.UserCardManager;
import tools.savers.PhonsStorageManager;
import tools.savers.HistoriesStorageManager;
import tools.savers.CustomersStorageManager;
import tools.savers.UsersStorageManager;


public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private PhoneManager phoneManager = new PhoneManager(); 
    private CustomerManager customerManager = new CustomerManager(); 
    private UserCardManager userCardManager = new UserCardManager();
    
    private CustomersStorageManager customersStorageManager = new CustomersStorageManager();
    private PhonsStorageManager phonsStorageManager = new PhonsStorageManager();
    private HistoriesStorageManager historiesStorageManager = new HistoriesStorageManager();
    private UsersStorageManager usersStorageManager = new UsersStorageManager();
    public void printManagerUI(User[] users, Customer[] customers, Phone[] phons, History[] histories){
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
                    Phone phone = phoneManager.createPhone;
                    phoneManager.addPhoneToArray(phone,phons);
                    break;

                case "2":
                    System.out.println("--- Список телефонов в наличии ---");
                    phoneManager.printListPhons(phons);
                    break;
                case "3":
                    System.out.println("--- Добавить заказчика ---");
                   Customer customer = customerManager.createCustomer();
                    customerManager.addCustomerToArray(customer,customers);
                    break;
                case "4":
                    System.out.println("--- Список заказчиков ---");
                   customerManager.printListCustomers(customers);
                    break;
                case "5":
                    System.out.println("--- Оформить заказ телефона ---");
                     userCardManager.checkOutPhone(phons, customers, histories);
                    break;
                case "6":
                    System.out.println("--- Отмена заказа ---");
                     userCardManager.returnPhone(histories);
                    break;
                case "7":  
                    System.out.println("--- Список проданных телефонов ---");
                   userCardManager.printListReadPhons(histories);
                    break;
                default:
                    System.out.println("Нет такой задачи");;
            }
        }while(repeat);
    }
     public void printReaderUI(User[] users, Reader[] readers, Book[] books, History[] histories){
        boolean repeat = true;
        do{
            System.out.println("=============================");
            System.out.println("Задачи:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Список всех телефонов в наличии");
            System.out.println("2. Оформить заказ телефона");
            System.out.println("3. Отмена заказа");
            System.out.println("4. Список проданных телефонов");
            System.out.print("Выберите задачу: ");
            String task = scanner.nextLine();
            System.out.println("=============================");
            switch (task) {
                case "0":
                    System.out.println("--- конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Список всех телефонов в наличии ---");
                    phoneManager.printListPhons(phons);
                    break;
                case "2":
                    System.out.println("--- Оформить заказ телефона ---");
                    userCardManager.checkOutPhone(phons, customers, histories);
                    break;
                case "3":
                    System.out.println("--- Отмена заказа ---");
                    userCardManager.returnPhone(histories);
                    break;
                case "4":  
                    System.out.println("--- Список проданных телефонов ---");
                    userCardManager.printListReadPhons(histories);
                    break;
                default:
                    System.out.println("Нет такой задачи");;
            }
        }while(repeat);
    }
}


 

