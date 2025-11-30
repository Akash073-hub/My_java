package Advanced_Library_Management_System;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;


public class ALMS {
    static void main() {
        System.out.println("Advanced Library Management System");
        List<LibraryBook> books = new ArrayList<>();
        try {
            books.add(new LibraryBook(false, null, 101, "Java Basics", "James Gosling", 499));
            books.add(new LibraryBook(true, "2024-05-01", 102, "Python Fundamentals", "Guido van Rossum", 599));
            books.add(new LibraryBook(false, null, 103, "C++ Programming", "Bjarne Stroustrup", 699));
        } catch (InvalidPriceException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
        Set<Integer> uniqueIds = new HashSet<>();
        for (LibraryBook b : books) {
            uniqueIds.add((int) b.bookid);
        }
        Map<Integer, String> bookMap = new HashMap<>();
        for (LibraryBook b : books) {
            bookMap.put((int)(b.bookid), b.title);
        }
        Map<Integer, String> sortedMap = new TreeMap<>(bookMap);

        Iterator<Map.Entry<Integer, String>> it = sortedMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        Operation var_1 = (x) -> x - (x * 0.10) ;

        double discountedPrice = var_1.apply(500);

        
    }
}
