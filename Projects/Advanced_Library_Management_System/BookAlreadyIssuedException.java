package Advanced_Library_Management_System;

public class BookAlreadyIssuedException extends Exception {
    public BookAlreadyIssuedException(String message){
        super(message);
    }
}
