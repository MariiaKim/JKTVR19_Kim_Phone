/*
добавление телефонов в магазин
 */
package tools.creaters;
import entity.Phone;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PhoneManager {

    

   public Phone addPhone() {
        Phone phone = new Phone();
        System.out.println("--- Добавить телефон ---");
        System.out.println("Введите марку:");
        Scanner scanner = new Scanner(System.in);
        phone.setMarka_title(scanner.nextLine());
        System.out.println("Введите модель:");
        phone.setModel_title(scanner.nextLine());
        System.out.println("Введите цену:");
        phone.setPrice(scanner.nextInt());       
        System.out.println("Введите год издания:");
        phone.setPublishedYear(scanner.nextInt());
        return phone;
    }
    


    public void addPhoneToArray(Phone phone, Phone[] phons) {
           for (int i = 0; i < phons.length; i++) {
                        if(phons[i] == null){
                            phons[i] = phone;
                            break;
                        }
                    }
    }
  public boolean printListBooks(Phone[] phons) {
        if(phons == null || phons.length < 1){
            System.out.println("Заказов нет!");
            return false;
        }
        int j = 0;
        for (Phone b : phons) {
            if(b != null){
                System.out.println(j+1+". "+b.toString());
                j++;
            }
        }
        return true;
  
  }
    
}

