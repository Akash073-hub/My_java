package hotel;
import com.sun.source.tree.ContinueTree;
import java.util.*;
import java.util.Scanner;
import hotel.breakfast;
import hotel.Lunch;
import hotel.Dinner;
import hotel.Cold_and_beverages;
import java.sql.*;
import hotel.order_database; 




public class hotel_managment {
    public static void main(String[] args) {
        Menu var_1 = new Menu();
        A var_12 = new A();
        LunchMenu var_13 = new LunchMenu();
        DinnerMenu var_14 =new DinnerMenu();
        Cold_and_beverages_Menu var_15 = new Cold_and_beverages_Menu();
        var_1.menu(var_12,var_13,var_14,var_15); 
         
    }
}

class Menu{
    void menu(A obj,LunchMenu obj1,DinnerMenu obj2,Cold_and_beverages_Menu obj3){
        System.out.println("-------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to have? ");
        System.out.println("1.Breakfast");
        System.out.println("2.Lunch");
        System.out.println("3.Dinner");
        System.out.println("4.Cold and beverages");
        System.out.printf("%-18s %10s%n","5.Stake"," - 2000-2500");
        System.out.println("waiting for the order.......");
        System.out.println("-------------------------------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("sorry for the trouble");
            this.menu(obj,obj1,obj2,obj3);
            return;
        }
        System.out.println("What would you like to have from Breakfast is 1, Lunch is 2, Dinner is 3, Cold and beverages is 4. Stake is 5");
        if (!sc.hasNextInt()){
            System.out.println("Please enter the integer number from 1 to 5.");
            this.menu(obj, obj1, obj2, obj3);
            return;
        }
        else{
            System.out.println("-------------------------------");
            int n =sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid option...");
                this.menu(obj,obj1,obj2,obj3);
                return;
            }
            else{
        switch(n){
            case 1 ->
                obj.Breakfast();
            case 2 ->
                obj1.lunch();
            case 3 ->
                obj2.dinner();
            case 4 ->
                obj3.cold_and_beverages();
            case 5 ->{
    System.out.println("----------------------------");
    System.out.println("Which type of Stake would you like..");
    System.out.printf("%-18s %10s%n", "1.Very rare.", " - 2000");
    System.out.printf("%-18s %10s%n", "2.Rare.", " - 2100");
    System.out.printf("%-18s %10s%n", "3.Medium rare.", " - 2200");
    System.out.printf("%-18s %10s%n", "4.Medium well.", " - 2300");
    System.out.printf("%-18s %10s%n", "5.Well done.", " - 2500");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        System.out.println("sorry for the trouble");
        this.menu(obj, obj1, obj2, obj3);
        return;
    }
    System.out.println("----------------------------");
    if (!sc.hasNextInt()) {
        System.out.println("Please enter the integer number from 1 to 5.");
        this.menu(obj, obj1, obj2, obj3);
        return;
    } else {
        int k = sc.nextInt();
        if (k <= 0) {
            System.out.println("Invalid option...");
            this.menu(obj, obj1, obj2, obj3);
            return;
        } else {
            String[] steakTypes = {"Very rare", "Rare", "Medium rare", "Medium well", "Well done"};
            int[] steakPrices = {2000, 2100, 2200, 2300, 2500};
            String foodName = steakTypes[k - 1];
            int price = steakPrices[k - 1];

            System.out.print("Enter your name: ");
            sc.nextLine(); // consume newline
            String customerName = sc.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            int total = price * quantity;

            // Using current date
            java.sql.Date orderDate = new java.sql.Date(System.currentTimeMillis());

            // Generate unique order ID, e.g., using UUID
            String orderId = UUID.randomUUID().toString();

            // Save to DB
            order_database.insertOrder(orderId, customerName, foodName, price, quantity, total, orderDate);

            System.out.printf("Order Placed: %s x%d for %s. Total = %d\n", foodName, quantity, customerName, total);
        }
    }
        System.out.println("-------------------------------");

    }
            default ->{
                System.out.println("sorry for the trouble");
                this.menu(obj,obj1,obj2,obj3);
                return;
            }
        }
        System.out.println("Thank you for the order wait for a bit..........");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("sorry for the trouble");
            this.menu(obj,obj1,obj2,obj3);
            return;
        }
        System.out.println("Here is your order.");
        System.out.println("-------------------------------");
            }
        }
    }
}