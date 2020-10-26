/*
 добавление заказчика
 */
package tools.creaters;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerManager {

    
    public Customer addCustomer() {
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
    
}

