
//Isabelly Barbosa Gonçalves
//Joao Antonio Dias
public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Author 01", "author01@somewhere.com.br", 'm');
        authors[1] = new Author("Author 02", "author02@nowhere.com.br", 'm');

        Book testBook = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(testBook);
    }
}
import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String toString() {
        String authorsStr = Arrays.toString(authors);
        return "Book[name=" + name + ",authors=" + authorsStr + ",price=" + price + ",qty=" + qty + "]";
    }
}
