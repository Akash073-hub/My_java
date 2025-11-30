package Advanced_Library_Management_System;

public class LibraryBook extends Book implements Printable {
    boolean isIssued;
    String issuedTo;

    LibraryBook(boolean isIssued, String issuedTo, int bookid, String title, String author, double price) throws  InvalidPriceException {
        super(bookid, title, author, price);
        this.isIssued = isIssued;
        this.issuedTo = issuedTo;
    }

    void issueBook(String studentName) {
        System.out.println("Issue Book" + title + " to " + studentName);

    }

    void issueBook(String studentName, boolean showMessage) {
        if (showMessage) {
            System.out.println("Issue Book" + title + " to " + studentName + " " + showMessage);
        }
    }

    class Metadata {
        String addedBy;
        String purpose;

        Metadata(String addedBy, String purpose) {
            this.addedBy = addedBy;
            this.purpose = purpose;
        }

    }
    @Override
    public void performAction(){
        System.out.println("Performing action on book: " + title);
    }
    @Override
    public void printDetails() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Is Issued: " + isIssued);
        System.out.println("Issued To: " + issuedTo);
    }

    double[] last5Prices = new double[5];

    double sum = 0;
    double highest = 0;
    double lowest = Integer.MAX_VALUE;
    void high_low() {

        for (int i = 0; i < last5Prices.length; i++) {
            sum += last5Prices[i];
            if (highest < last5Prices[i]) {
                highest = last5Prices[i];
            }
            if (lowest > last5Prices[i]) {
                lowest = last5Prices[i];
            }
        }
        double avg = sum/(last5Prices.length);
    }
    void issueBook() throws BookAlreadyIssuedException {
        if (isIssued) {
            throw new BookAlreadyIssuedException("This book is already issued!");
        }
        isIssued = true;
    }

    void setPrice(double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative!");
        }
    }

}

