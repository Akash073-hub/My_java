package constructor;

import java.sql.SQLOutput;

class Book_2 {
    double price;
    String title;

    Book_2(){
        price = 99.9;
        title = "Java Programming";
    }
    Book_2(double price, String title) {
        this.price = price;
        this.title = title;
    }

    static void main() {
        Book_2 book_1 = new Book_2();
        Book_2 book_2 = new Book_2(120.46, "Data Structures");

        System.out.println("Book 1: " + book_1.title + " with price $" + book_1.price);
        System.out.println("Book 2: " + book_2.title + " with price $" + book_2.price);
    }
}
