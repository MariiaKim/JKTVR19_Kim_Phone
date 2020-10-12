/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazin_kim;
import tools.savers.CustomersStorageManager;
import tools.creaters.CustomerManager;
import entity.Customer;
import entity.Vinil;
import entity.History;
import java.util.GregorianCalendar;
import java.util.Scanner;
import tools.creaters.VinilManager;
import tools.savers.VinilsStorageManager;
import tools.savers.HistoriesStorageManager;
import tools.creaters.UserCardManager;


/**
 *
 * @author Melnikov
 */
public class App {
    private Scanner scanner = new Scanner(System.in);
    private Customer[] customers = new Customer[10];
    private Vinil[] vinils = new Vinil[10];
    private History[] histories = new History[10];

    public App() {
        CustomersStorageManager rsm = new CustomersStorageManager();
        Customer[] loadedCustomers = rsm.loadCustomersFromFile();
        if(loadedCustomers != null){
            customers = loadedCustomers;
        }
        VinilsStorageManager bsm = new VinilsStorageManager();
        Vinil[] loadedVinils = bsm.loadVinilsFromFile();
        if(loadedVinils != null){
            vinils = loadedVinils;
        }
        HistoriesStorageManager historiesStorageManager = new HistoriesStorageManager();
        History[] loaderHistories = historiesStorageManager.loadHistoriesFromFile();
        if(loaderHistories != null){
            histories = loaderHistories;
        }
    }

    public void run() {
        System.out.println("--- Библиотека ---");
        boolean repeat = true;
        do{
           System.out.println("=============================");
        System.out.println("Задачи магазина");
        System.out.println("0.выйти из программы");
        System.out.println("1.Добавить пластинку");
        System.out.println("2.посмотреть список пластинок");
        System.out.println("3.Добавить заказчиков");
        System.out.println("4. список заказчиков");
        System.out.println("5.выдать пластинку");
        System.out.println("6.вернуть пластинку");
        System.out.println("7.список проданных пластинок:");
        System.out.println("выбирите задачу: ");
        String task = scanner.nextLine();
        System.out.println("=============================");
            switch (task) {
                case "0":
                    System.out.println("--- конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("1.Добавить пластинку");
                    VinilManager VinilManager = new VinilManager(); 
                    Vinil vinil = VinilManager.addVinil();
                    for (int i = 0; i < vinils.length; i++) {
                        if(vinils[i] == null){
                            vinils[i] = vinil;
                            break;
                        }
                    }
                    VinilsStorageManager vinilsStorageManager = new VinilsStorageManager();
                    vinilsStorageManager.saveVinilsToFile(vinils);
                    break;
                case "2":
                     System.out.println("2.посмотреть список пластинок");
                    int j = 0;
                    for (Vinil b : vinils) {
                        if(b != null){
                            System.out.println(j+1+". "+b.toString());
                            j++;
                        }
                    }
                    break;
                case "3":
                    System.out.println("3.Добавить заказчиков");
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
                    System.out.println("4. список заказчиков");
                    int n = 0;
                    for (Customer r : customers) {
                        if(r != null){
                            System.out.println(n+1+". "+r.toString());
                            n++;
                        }
                    }
                    break;
                case "5":
                    System.out.println("5.выдать пластинку");
                    UserCardManager userCardManager = new UserCardManager();
                    History history = userCardManager.giveVinil(vinils, customers);
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
                     System.out.println("6.вернуть пластинку");
                    
                    System.out.println("список проданных пластинок:");
                    boolean notReadBooks = true;
                    for (int i = 0;i<histories.length;i++) {
                        if(histories[i] != null && histories[i].getReturnDate() == null){
                            System.out.printf("%d. Книгу \"%s\" читает %s %s%n"
                                    ,i+1
                                    ,histories[i].getVinil().getTitle()
                                    ,histories[i].getCustomer().getFistname()
                                    ,histories[i].getCustomer().getLastname()
                            );

                            boolean notReadVinils = false;
                        }
                    }
                    if(notReadBooks){
                        System.out.println("Заказанных пластинок нет");
                        break;
                    }
                    System.out.println("Выберите номер заказанных пластинок: ");
                    int historyNumber = scanner.nextInt();
                    histories[historyNumber - 1].setReturnDate(new GregorianCalendar().getTime());
                    historiesStorageManager = new HistoriesStorageManager();
                    historiesStorageManager.saveHistoriesToFile(histories);
                    break;
                case "7":  
                   System.out.println("7.список проданных пластинок:");
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
