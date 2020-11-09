/*
 добавление заказчика
 */
package tools.creaters;

import entity.Customer;
import java.util.Scanner;
import tools.savers.CustomersStorageManager;
/**
 *
 * @author pupil
 */
public class CustomerManager {
private CustomersStorageManager customersStorageManager = new CustomersStorageManager();
    
    public Customer createCustomer() {
        Customer customer = new Customer();
        System.out.println("------зарегистрировать заказчика------");
        System.out.println("введите имя:");
        Scanner scanner = new Scanner(System.in);
        customer.setFistname(scanner.nextLine());
        System.out.println("введите фамилию:");
        customer.setLastname(scanner.nextLine());
        System.out.println("введите телефон:");
        customer.setNumber_phone(scanner.nextLine());
        System.out.println("введите внесенную сумму:");
        customer.setSumma(scanner.nextInt());
        
        return customer;
    }
      public void addCustomerToArray(Customer customer, Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            if(customers[i] == null){
                customers[i] = customer;
                break;
            }
        } 
        customersStorageManager.saveCustomersToFile(customers);
    }
       public void printListCustomers(Customer[] customers) {
        int n = 0;
        for (Customer r : customers) {
            if(r != null){
                System.out.println(n+1+". "+r.toString());
                n++;
            }
    
            }
   
        }
    }
    
