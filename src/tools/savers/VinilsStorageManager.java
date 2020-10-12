/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.savers;

import entity.Vinil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



public class VinilsStorageManager {

    public void saveVinilsToFile(Vinil[] vinils) {
        String fileName = "vinils";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
    try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(vinils);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Нет такого файла");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода ввывода");
        }
    }
    public Vinil[] loadVinilsFromFile(){
        Vinil[] vinils = null;
        String fileName = "vinils";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
        fis = new FileInputStream(fileName);
        ois = new ObjectInputStream(fis);
        return (Vinil[]) ois.readObject();
     } catch (FileNotFoundException ex) {
            System.out.println("Нет такого файла");
     } catch (IOException ex) {
            System.out.println("Ошибка ввода ввывода");
        } catch (ClassNotFoundException ex) {       
           System.out.println("Нет такого класса");
        }
        return vinils;
    }
    
}

        


