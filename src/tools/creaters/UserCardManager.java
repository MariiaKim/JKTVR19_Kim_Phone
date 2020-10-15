/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.creaters;

import entity.Vinil;
import entity.History;
import entity.Customer;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class UserCardManager {
    private Scanner scanner = new Scanner(System.in);

    public History giveVinils(Vinil[] vinils, Customer[] customers) {
//        History history = new History();
        System.out.println("--- Список заказчиков ---");
        int n = 0;
        for (Customer r : customers) {
            if(r != null){
                System.out.println(n+1+". "+r.toString());
                n++;
            }
        }
        System.out.print("Выберите номер пластинки: ");    
        int customerNumber = scanner.nextInt();
        scanner.nextLine();
        Customer reader = customers[customerNumber - 1];
        System.out.println("--- Список пластинок ---");
        n = 0;
        for (Vinil b : vinils) {
            if(b != null){
                System.out.println(n+1+". "+b.toString());
                n++;
            }
        }
         System.out.print("Выберите номер пластинки: ");    
         int vinilNumber = scanner.nextInt();
         Vinil vinil = vinils[vinilNumber - 1];
         Calendar calendar = new GregorianCalendar();
//         history.setBook(book);
//         history.setReader(reader);
//         history.setTakeOnDate(calendar.getTime());
//         History history = new History(book, reader, calendar.getTime(), null);
//         return history; 
        return new History(vinil, reader, calendar.getTime(), null);
    }

    public void returnVinils(History[] histories) {
        System.out.println("Заказ:");
        boolean notReadVinils = true;
        for (int i = 0;i<histories.length;i++) {
            if(histories[i] != null && histories[i].getReturnDate() == null){
                System.out.printf("%d. Пластинку \"%s\" заказал %s %s%n"
                        ,i+1
                        ,histories[i].getVinil().getTitle()
                        ,histories[i].getCustomer().getFistname()
                        ,histories[i].getCustomer().getLastname()
                );
                notReadVinils = false;
            }
        }
        if(notReadVinils){
            System.out.println("Нет пластинок под заказ");
            return;
        }
        System.out.println("Выберите номер возвращаемой пластинки: ");
        int historyNumber = scanner.nextInt();
        histories[historyNumber - 1].setReturnDate(new GregorianCalendar().getTime());
                    
    }

   
    
}
