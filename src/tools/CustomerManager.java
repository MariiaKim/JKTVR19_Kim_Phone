/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Customer;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class CustomerManager {

    /**
     *
     * @return
     */
    public Customer addCustomer() {
        Customer customer = new Customer();
        System.out.println("------зарегистрировать заказчика------");
        System.out.println("введите имя:");
        Scanner scanner = new Scanner(System.in);
        customer.setFistname(scanner.nextLine());
        System.out.println("введите фамилию:");
        customer.setLastname(scanner.nextLine());
        System.out.println("введите телефон:");
        customer.setPhone(scanner.nextLine());
        
        return customer;
    }
    
}

