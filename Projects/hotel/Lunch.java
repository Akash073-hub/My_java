package hotel;
import java.util.*;
import java.util.Scanner;
import java.lang.System;

public class Lunch{
    public static void main(String[] args) {
        LunchMenu var_13 = new LunchMenu();
        var_13.lunch();
    }
}

class LunchMenu{
    void lunch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Waiting for the order......");
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) { 
            System.out.println("Sorry for the error.");
            this.lunch();
            return;
        }
        System.out.println("What would you like to have .");
        System.out.printf("%-18s %10s%n", "1.Rice.", " - 80-100");
        System.out.printf("%-18s %10s%n","2.Rajma with curry."," - 120");
        System.out.printf("%-18s %10s%n","3.Biriyani."," - 200-220");
        System.out.printf("%-18s %10s%n","4.Pulav."," - 120");
        System.out.printf("%-18s %10s%n","5.Creamy butter chicken curry."," - 200");
        System.out.printf("%-18s %10s%n","6.2 pieces garlic naan bread."," - 160");
        System.out.printf("%-18s %10s%n","7.Green curry with vegetables/tofu."," - 140");
        System.out.println("------------------------------");
        if (!sc.hasNextInt()){
            System.out.println("Please enter the integer number from 1 to 7.");
            sc.next();
            this.lunch();
            return; 
        }
        else{
            int var_1 =sc.nextInt();
            if (var_1 <= 0) {
                System.out.println("Invalid option...");
                this.lunch();
                return;
            }
            else{
                System.out.println("---------------------------");
                switch(var_1) {
                    case 1 -> {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("Sorry for the error.");
                            this.lunch();
                            return;
                        }
                        System.out.println("What kind of you want ..");
                        System.out.printf("%-18s %10s%n","1.Plain Steamed Rice."," - 80");
                        System.out.printf("%-18s %10s%n","2. Jeera Rice (Cumin Rice)."," - 90");
                        System.out.printf("%-18s %10s%n","3.Ghee Rice."," - 100");
                        System.out.printf("%-18s %10s%n","4.Lemon Rice."," - 100");
                        System.out.printf("%-18s %10s%n","5.Tamarind Rice (Puliyogare)."," - 100");
                        System.out.println("---------------------------");
                        if (!sc.hasNextInt()){
                            System.out.println("Please enter the integer number from 1 to 5.");
                            sc.next();
                            this.lunch();
                            return; 
                        }
                        else{
                            System.out.println("---------------------------");
                            int var_2 =sc.nextInt();
                            if (var_2 <= 0) {
                                System.out.println("Invalid option...");
                                this.lunch();
                                return;
                            }
                            else{
                                switch(var_2) {
                                    case 1:
                                        System.out.println("Plain Steamed Rice");
                                        break;
                                    case 2:
                                        System.out.println("Jeera Rice (Cumin Rice)");
                                        break;
                                    case 3:
                                        System.out.println("Ghee Rice");
                                        break;
                                    case 4:
                                        System.out.println("Lemon Rice");
                                        break;
                                    case 5:
                                        System.out.println("Tamarind Rice (Puliyogare)");
                                        break;
                                    default:
                                        System.out.println("Sorry for the error.");
                                        this.lunch();
                                        break;
                                }
                            }
                        }
                    }
                    case 2 ->
                        System.out.println("Rajma with curry.");
                    case 3 -> {
                        try {
                            Thread.sleep(1000);
                        } 
                        catch (InterruptedException e) {
                            System.out.println("Sorry for the error.");
                            this.lunch();
                            return;
                        }
                        System.out.println("What kind of you want ..");
                        System.out.printf("%-18s %10s%n","1.Hyderabadi - Very spicy, famous worldwide."," - 200");
                        System.out.printf("%-18s %10s%n","2.Lucknowi - Mild, royal preparation."," - 210");
                        System.out.printf("%-18s %10s%n","3.Kolkata - With potato, unique flavor."," - 210");
                        System.out.printf("%-18s %10s%n","4.Vegetable - Mixed veggies."," - 220");
                        System.out.println("---------------------------");
                        if (!sc.hasNextInt()){
                            System.out.println("Please enter the integer number from 1 to 4.");
                            sc.next();
                            this.lunch();
                            return; 
                        }
                        else{
                            int var_3 =sc.nextInt();
                            if (var_3 <= 0) {
                                System.out.println("Invalid option...");
                                this.lunch();
                                return;
                            }
                            else{
                                System.out.println("---------------------------");
                                switch(var_3) {
                                    case 1:
                                        System.out.println("Hyderabadi - Very spicy, famous worldwide");
                                        break;
                                    case 2:
                                        System.out.println("Lucknowi - Mild, royal preparation");
                                        break;
                                    case 3:
                                        System.out.println("Kolkata - With potato, unique flavor");
                                        break;
                                    case 4:
                                        System.out.println("Vegetable - Mixed veggies");
                                        break;
                                    default:
                                        System.out.println("Sorry for the error.");
                                        this.lunch();
                                        break;
                                }
                            }
                        }
                    }
                    case 4 ->
                        System.out.println("Pulav");
                    case 5 ->
                        System.out.println("Creamy butter chicken curry");
                    case 6 ->
                        System.out.println("2 pieces garlic naan bread");
                    case 7 ->
                        System.out.println("Green curry with vegetables/tofu");
                    default -> {
                        System.out.println("Sorry for the error.");
                        this.lunch();
                        return;
                    }
                }
                System.out.println("---------------------------");
            }
        }
    }  
}  