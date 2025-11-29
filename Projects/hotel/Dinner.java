package hotel;
import java.lang.System;
import java.util.*;
import java.util.Scanner;


public class Dinner {
    public static void main(String[] args) {
        DinnerMenu var_1 = new DinnerMenu();
        var_1.dinner();
    }
}
class DinnerMenu{
    void dinner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Waiting for the order......");
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) { 
            System.out.println("Sorry for the error.");
            this.dinner();
            return;
        }
        System.out.println("What would you like to have.");
        System.out.printf("%-18s %10s%n","1.8oz beef tenderloin with red wine sauce."," - 240");
        System.out.printf("%-18s %10s%n","2.Grilled asparagus and garlic potatoes."," - 230");
        System.out.printf("%-18s %10s%n","3.Rosemary garlic lamb chops."," - 290");
        System.out.printf("%-18s %10s%n","4.Parmesan cheese and truffle oil."," - 310");
        System.out.printf("%-18s %10s%n","5.Atlantic salmon with lemon butter sauce."," - 400");
        System.out.println("------------------------------");
        if (!sc.hasNextInt()){
            System.out.println("Please enter the integer number from 1 to 4.");
            sc.next();
            this.dinner();
            return; 
        }
        else{
            int var_1 =sc.nextInt();
            if (var_1 <= 0) {
                System.out.println("Invalid option...");
                this.dinner();
                return;
            }
            else{
                System.out.println("------------------------------");
                switch(var_1){
                    case 1 ->
                        System.out.println("8oz beef tenderloin with red wine sauce.");
                    case 2 ->
                        System.out.println("Grilled asparagus and garlic potatoes.");
                    case 3 ->
                        System.out.println("Rosemary garlic lamb chops.");
                    case 4 ->
                        System.out.println("Parmesan cheese and truffle oil.");
                    case 5 ->
                        System.out.println("Atlantic salmon with lemon butter sauce.");
                    default -> {
                        System.out.println("Sorry for the error.");
                        this.dinner();
                        return;
                    }
                }
            }
                System.out.println("------------------------------");
        }
    }
}