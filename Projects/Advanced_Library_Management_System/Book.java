package Advanced_Library_Management_System;

public class Book extends LibraryAction {
    int bookid;
    String title;
    String author;
    double price;
    Book(int bookid, String title, String author, double price) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public void performAction(){
        System.out.println("Performing action on book: " + title);
    }

}

