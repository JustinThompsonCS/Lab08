/**
 * Created by 154424 on 12/10/2018.
 */
public class Book {
    private String title, author;
    private double price;

    public Book(String t, String a, double p){
        title = t;
        author = a;
        price = p;
    }

    public String toString(){
        return title + ", by " + author + ". Cost: $" + price;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
