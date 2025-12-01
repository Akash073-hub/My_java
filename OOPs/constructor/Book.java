package constructor;

public class Book {
    int id;
    String title;
    String author;
    double price ;
    Book(int id, String title, String author, double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    static void main() {
        Book b1 = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book b2 = new Book(102, "To Kill a Mockingbird", "Harper Lee", 12.99);

        System.out.println("Book 1: " + b1.title + " by " + b1.author + " (ID: " + b1.id + ", Price: $" + b1.price + ")");
        System.out.println("Book 2: " + b2.title + " by " + b2.author + " (ID: " + b2.id + ", Price: $" + b2.price + ")");

    }
}
