
package entity;


import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Vinil implements Serializable{
    private String title;
    private String author;
    private Integer publishedYear;

    public Vinil() {
    }

    public Vinil(String title, String author, Integer publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Vinil{" + "title=" + title + ", author=" + author + ", publishedYear=" + publishedYear + '}';
    }

    
}
