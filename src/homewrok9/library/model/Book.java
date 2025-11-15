package homewrok9.library.model;


import java.util.Objects;

public class Book {
    private String id;
    private String title;
    private String authorName;
    private double price;
    private int quantity;


    public Book(String title, String authorName, double price, String id, int quantity) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                " id='" + id + '\'' +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}
