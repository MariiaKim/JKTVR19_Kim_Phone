
package entity;



import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class History implements Serializable{
    private Vinil vinil;
    private Customer customer;
    private Date takeOnDate;
    private Date returnDate;

    public History() {
    }

    public History(Vinil vinil, Customer customer, Date takeOnDate, Date returnDate) {
        this.vinil = vinil;
        this.customer = customer;
        this.takeOnDate = takeOnDate;
        this.returnDate = returnDate;
    }

    public Vinil getVinil() {
        return vinil;
    }

    public void setVinil(Vinil vinil) {
        this.vinil = vinil;
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
        return "History{" + "vinil=" + vinil + ", customer=" + customer + ", takeOnDate=" + takeOnDate + ", returnDate=" + returnDate + '}';
    }

    
}

