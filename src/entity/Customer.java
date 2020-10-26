/*
 добавление заказчиков
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Customer implements Serializable{
    private String fistname;
    private String lastname;
    private String number_phone;
    private Integer summa ;

    public Customer() {
    }

    public Customer(String fistname, String lastname, String number_phone, Integer summa) {
        this.fistname = fistname;
        this.lastname = lastname;
        this.number_phone = number_phone;
        this.summa = summa;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(String number_phone) {
        this.number_phone = number_phone;
    }

    public Integer getSumma() {
        return summa;
    }

    public void setSumma(Integer summa) {
        this.summa = summa;
    }

    @Override
    public String toString() {
        return "Customer{" + "fistname=" + fistname + ", lastname=" + lastname + ", number_phone=" + number_phone + ", summa=" + summa + '}';
    }

    

    
   
   
}

