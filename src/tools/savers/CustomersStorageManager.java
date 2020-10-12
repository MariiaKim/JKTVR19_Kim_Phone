/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.savers;

import entity.Vinil;
import entity.Customer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class CustomersStorageManager {

    public void saveCustomersToFile(Customer[] customers) {
        
        String fileName = "customers";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(customers);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Нет такого файла");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода ввывода");
        }
    }
    public Customer[] loadCustomersFromFile(){
        Customer[] customers = null;
        String fileName = "customers";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
        fis = new FileInputStream(fileName);
        ois = new ObjectInputStream(fis);
        return (Customer[]) ois.readObject();
     } catch (FileNotFoundException ex) {
            System.out.println("Нет такого файла");
     } catch (IOException ex) {
            System.out.println("Ошибка ввода ввывода");
        } catch (ClassNotFoundException ex) {       
           System.out.println("Нет такого класса");
        }
        return customers;
    }

    

  
    
}
