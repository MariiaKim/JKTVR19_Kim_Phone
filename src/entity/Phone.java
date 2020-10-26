
package entity;


import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Phone implements Serializable{
    private String marka_title;
    private String model_title;
    private Integer publishedYear;
    private Integer price ;

    public Phone() {
    }

    public Phone(String marka_title, String model_title, Integer publishedYear, Integer price) {
        this.marka_title = marka_title;
        this.model_title = model_title;
        this.publishedYear = publishedYear;
        this.price = price;
    }

    public String getMarka_title() {
        return marka_title;
    }

    public void setMarka_title(String marka_title) {
        this.marka_title = marka_title;
    }

    public String getModel_title() {
        return model_title;
    }

    public void setModel_title(String model_title) {
        this.model_title = model_title;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" + "marka_title=" + marka_title + ", model_title=" + model_title + ", publishedYear=" + publishedYear + ", price=" + price + '}';
    }
    
    

   
}
