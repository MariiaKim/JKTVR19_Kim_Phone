/*
создание картотеки всех заказчиков 
 */
package tools.creaters;

import entity.Phone;
import entity.History;
import entity.Customer;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class UserCardManager {
    private Scanner scanner = new Scanner(System.in);

    public History givePhons(Phone[] phons, Customer[] customers) {
//        History history = new History();
        System.out.println("--- Список заказчиков ---");
        int n = 0;
        for (Customer r : customers) {
            if(r != null){
                System.out.println(n+1+". "+r.toString());
                n++;
            }
        }
        System.out.print("Выберите вариант из списка: ");    
        int customerNumber = scanner.nextInt();
        scanner.nextLine();
        Customer customer  = customers[customerNumber - 1];
        System.out.println("--- Список товара ---");
        n = 0;
        for (Phone b : phons) {
            if(b != null){
                System.out.println(n+1+". "+b.toString());
                n++;
            }
        }
         System.out.print("Выберите вариант из списка: ");    
         int vinilNumber = scanner.nextInt();
         Phone phone = phons[vinilNumber - 1];
         Calendar calendar = new GregorianCalendar();

        return new History(phone, customer, calendar.getTime(), null);
    }

    public void returnPhons(History[] histories) {
        System.out.println("Заказ:");
        boolean notReadPhons = true;
        for (int i = 0;i<histories.length;i++) {
            if(histories[i] != null && histories[i].getReturnDate() == null){
                System.out.printf("%d. Заказ \"%s\" оформил %s %s%n"
                        ,i+1
                        ,histories[i].getPhone().getMarka_title()
                        ,histories[i].getPhone().getPrice()
                        ,histories[i].getCustomer().getFistname()
                        ,histories[i].getCustomer().getLastname()
                );
                notReadPhons = false;
            }
        }
        if(notReadPhons){
            System.out.println("Нет товара под заказ");
            return;
        }
        System.out.println("Выберите номер возврата: ");
        int historyNumber = scanner.nextInt();
        histories[historyNumber - 1].setReturnDate(new GregorianCalendar().getTime());
                    
    }

   
    
}
