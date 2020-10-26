/*
 добавление историй всех операций
 */

package entity;



import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class History implements Serializable{
    private Phone phone;
    private Customer customer;
    private Date takeOnDate;
    private Date returnDate;

    public History() {
    }

    public History(Phone phone, Customer customer, Date takeOnDate, Date returnDate) {
        this.phone = phone;
        this.customer = customer;
        this.takeOnDate = takeOnDate;
        this.returnDate = returnDate;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getTakeOnDate() {
        return takeOnDate;
    }

    public void setTakeOnDate(Date takeOnDate) {
        this.takeOnDate = takeOnDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "History{" + "phone=" + phone + ", customer=" + customer + ", takeOnDate=" + takeOnDate + ", returnDate=" + returnDate + '}';
    }

    
    
}

