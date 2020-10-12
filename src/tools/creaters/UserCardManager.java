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



public class UserCardManager  {

    public History giveVinil(Vinil[] vinils,Customer[] customers) {
        History history = new History();
        System.out.println(". список заказчиков");
         int t=0;
         for (Customer r : customers) {
             if(r != null){
                System.out.println(t+1+"."+r.toString());
                t++;
        }
         }
       for(int i = 0;i < customers.length;i++){
            if(customers[i] == null){
               System.out.println(i+1+"."+customers[i].toString());
               t++;
           }
        }
        System.out.println("выберите номер заказчика");
        Scanner scanner = new Scanner(System.in);
        int сustomerNumber = scanner.nextInt();
        Customer сustomer = customers[сustomerNumber - 1];
        System.out.println("===список пластинок====");
         int i = 0;
                for(Vinil b : vinils){
                    if (b != null){
                        System.out.println(i+1+"."+b.toString());
                        i++;
                    }
                }
        System.out.println("выберите номер пластинки");
        int vinilNumber = scanner.nextInt();
        Vinil vinil = vinils[vinilNumber -1];
        Calendar calendar = new GregorianCalendar();
        history.setVinil(vinil);
        history.setCustomer(сustomer);
        history.setTakeOnDate(calendar.getTime());
        
        return history;
         
    }
    }



