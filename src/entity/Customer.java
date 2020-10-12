/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    private String phone;

    public Customer() {
    }

    public Customer(String fistname, String lastname, String phone) {
        this.fistname = fistname;
        this.lastname = lastname;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "fistname=" + fistname + ", lastname=" + lastname + ", phone=" + phone + '}';
    }

   
}

