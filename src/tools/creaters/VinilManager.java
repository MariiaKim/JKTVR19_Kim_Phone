/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.creaters;
import entity.Vinil;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class VinilManager {

    

   public Vinil addVinil() {
        Vinil vinil = new Vinil();
        System.out.println("--- Добавить пластинку ---");
        System.out.println("Введите название:");
        Scanner scanner = new Scanner(System.in);
        vinil.setTitle(scanner.nextLine());
        System.out.println("Введите автора:");
        vinil.setAuthor(scanner.nextLine());
        System.out.println("Введите год издания:");
        vinil.setPublishedYear(scanner.nextInt());
        return vinil;
    }
    


    public void addVinilToArray(Vinil vinil, Vinil[] vinils) {
           for (int i = 0; i < vinils.length; i++) {
                        if(vinils[i] == null){
                            vinils[i] = vinil;
                            break;
                        }
                    }
    }

  
    
    
}

