/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import entity.Vinil;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class VinilManager {

    

    public Vinil addVinil() {
        Vinil vinil = new Vinil();
        System.out.println("------зарегистрировать пластинку------");
        System.out.println("введите автора:");
        Scanner scanner = new Scanner(System.in);
        vinil.setAuthor(scanner.nextLine());
        System.out.println("введите название:");
        vinil.setTitle(scanner.nextLine());
        System.out.println("введите дату:");
        vinil.setPublishedYear(scanner.nextInt());
       
        return vinil;
    
}
    
    
}

