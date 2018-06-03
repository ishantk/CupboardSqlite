package edureka.co.cupboardapp;

// Model or Bean or POJO(Plain Old Java Object)
public class Book {

    public String name;
    public String author;
    public int price;

    public Book() {
    }

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
