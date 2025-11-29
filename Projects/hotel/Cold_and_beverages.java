package hotel;
import java.util.*;
import java.util.Scanner;
import java.lang.System;


public class Cold_and_beverages {
    public static void main(String[] args) {
        Cold_and_beverages_Menu var_1 = new Cold_and_beverages_Menu();
        var_1.cold_and_beverages();
    }
}

class Cold_and_beverages_Menu{
    void cold_and_beverages(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Waiting for the order......");
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) { 
            System.out.println("Sorry for the error.");
            this.cold_and_beverages();
            return;
        }
        System.out.println("What would you like to have.");
        System.out.printf("%-18s %10s%n","1.Tea"," - 10-25");
        System.out.printf("%-18s %10s%n","2.Coffee"," - 40-70");
        System.out.printf("%-18s %10s%n","3.Soft drinks"," - 20");
        System.out.printf("%-18s %10s%n","4.Icetea"," - 30-40");
        System.out.println("------------------------------");
        if (!sc.hasNextInt()){
            System.out.println("Please enter the integer number from 1 to 4.");
            sc.next();
            this.cold_and_beverages();
            return; 
        }
        else{
            int var_1 =sc.nextInt();
            if (var_1 <= 0) {
                    System.out.println("Invalid option...");
                    this.cold_and_beverages();
                    return;
            }
            else{
                System.out.println("------------------------------");
                switch(var_1){
                    case 1 ->{
                        try {
                            Thread.sleep(1000);
                        } 
                        catch (InterruptedException e) {
                            System.out.println("Sorry for the error.");
                            this.cold_and_beverages();
                            return;
                        }
                        System.out.println("What kind of you want ..");
                        System.out.printf("%-18s %10s%n","1. Green Tea."," - 20");
                        System.out.printf("%-18s %10s%n","2. White Tea."," - 20");
                        System.out.printf("%-18s %10s%n","3. Yellow Tea."," - 20");
                        System.out.printf("%-18s %10s%n","4. Oolong Tea."," - 25");
                        System.out.printf("%-18s %10s%n","5. Black Tea."," - 10");
                        System.out.printf("%-18s %10s%n","6. Puerh Tea."," - 20");
                        System.out.println("------------------------------");
                        if (!sc.hasNextInt()){
                            System.out.println("Please enter the integer number from 1 to 6.");
                            sc.next();
                            this.cold_and_beverages();
                            return; 
                        }
                        else{
                            int var_2 =sc.nextInt();
                            if (var_2 <= 0) {
                                System.out.println("Invalid option...");
                                this.cold_and_beverages();
                                return;
                            }
                            else{
                                System.out.println("------------------------------");
                                switch(var_2){
                                    case 1:
                                        System.out.println("Green Tea.");
                                        break;
                                    case 2:
                                        System.out.println("White Tea.");
                                        break;
                                    case 3:
                                        System.out.println("Yellow Tea.");
                                        break;
                                    case 4:
                                        System.out.println("Oolong Tea.");
                                        break;
                                    case 5:
                                        System.out.println("Black Tea.");
                                        break;
                                    case 6:
                                        System.out.println("Puerh Tea.");
                                        break;
                                    default:
                                        System.out.println("Sorry for the error.");
                                        this.cold_and_beverages();
                                        return;
                                }
                                System.out.println("------------------------------");
                            }
                        }   
                    }
                    case 2 ->{
                        try {
                            Thread.sleep(1000);
                        } 
                        catch (InterruptedException e) {
                            System.out.println("Sorry for the error.");
                            this.cold_and_beverages();
                            return;
                        }
                        System.out.println("What kind of you want ..");
                        System.out.printf("%-18s %10s%n","1.Arabica."," - 50");
                        System.out.printf("%-18s %10s%n","2.Robusta."," - 50");
                        System.out.printf("%-18s %10s%n","3.Espresso."," - 60");
                        System.out.printf("%-18s %10s%n","4.Cappuccino."," - 70");
                        System.out.printf("%-18s %10s%n","5.Latte."," - 70");
                        System.out.printf("%-18s %10s%n","6.Black Coffee."," - 40");
                        System.out.println("------------------------------");
                        if (!sc.hasNextInt()){
                            System.out.println("Please enter the integer number from 1 to 6.");
                            sc.next();
                            this.cold_and_beverages();
                            return; 
                        }
                        else{
                            int var_3 =sc.nextInt();
                            if (var_3 <= 0) {
                                    System.out.println("Invalid option...");
                                    this.cold_and_beverages();
                                    return;
                            }
                            else{
                                System.out.println("------------------------------");
                                switch(var_3){
                                    case 1:
                                        System.out.println("Arabica.");
                                        break;
                                    case 2:
                                        System.out.println("Robusta.");
                                        break;
                                    case 3:
                                        System.out.println("Espresso.");
                                        break;
                                    case 4:
                                        System.out.println("Cappuccino.");
                                        break;
                                    case 5:
                                        System.out.println("Latte.");
                                        break;
                                    case 6:
                                        System.out.println("Black Coffee.");
                                        break;
                                    default:
                                        System.out.println("Sorry for the error.");
                                        this.cold_and_beverages();
                                        return;
                                }
                                System.out.println("------------------------------");
                            }
                        }
                    }
                    case 3 ->{
                        try {
                            Thread.sleep(1000);
                        } 
                        catch (InterruptedException e) {
                            System.out.println("Sorry for the error.");
                            this.cold_and_beverages();
                            return;
                        }
                        System.out.println("What kind of you want ..");
                        System.out.printf("%-18s %10s%n","1.Coca Cola."," - 20");
                        System.out.printf("%-18s %10s%n","2.Pespi."," - 20");
                        System.out.printf("%-18s %10s%n","3.Sprite."," - 20");
                        System.out.printf("4.Fanta."," - 20");
                        System.out.printf("%-18s %10s%n","5.Mirinda."," - 20");
                        System.out.printf("%-18s %10s%n","6.Frooti."," - 20");
                        System.out.println("------------------------------");
                        if (!sc.hasNextInt()){
                            System.out.println("Please enter the integer number from 1 to 6.");
                            sc.next();
                            this.cold_and_beverages();
                            return; 
                        }
                        else{
                            int var_4 =sc.nextInt();
                            if (var_4 <= 0) {
                                    System.out.println("Invalid option...");
                                    this.cold_and_beverages();
                                    return;
                            }
                            else{
                                System.out.println("------------------------------");
                                switch(var_4){
                                    case 1:
                                        System.out.println("Coca Cola.");
                                        break;
                                    case 2:
                                        System.out.println("Pespi.");
                                        break;
                                    case 3:
                                        System.out.println("Sprite.");
                                        break;
                                    case 4:
                                        System.out.println("Fanta.");
                                        break;
                                    case 5:
                                        System.out.println("Mirinda.");
                                        break;
                                    case 6:
                                        System.out.println("Frooti.");
                                        break;
                                    default:
                                        System.out.println("Sorry for the error.");
                                        this.cold_and_beverages();
                                        return;
                                }
                                System.out.println("------------------------------");
                            }
                        }
                    }
                    case 4 ->{
                        try {
                            Thread.sleep(1000);
                        } 
                        catch (InterruptedException e) {
                            System.out.println("Sorry for the error.");
                            this.cold_and_beverages();
                            return;
                        }
                        System.out.println("What kind of you want ..");
                        System.out.printf("%-18s %10s%n","1.Iced Black Tea (The Classic)."," - 30");
                        System.out.printf("%-18s %10s%n","2.Iced Earl Grey."," - 35");
                        System.out.printf("%-18s %10s%n","3.Southern Sweet Tea."," - 40");
                        System.out.printf("%-18s %10s%n","4.Green Tea Bases (Light & Grassy)."," - 40");
                        System.out.println("------------------------------");
                        if (!sc.hasNextInt()){
                            System.out.println("Please enter the integer number from 1 to 4.");
                            sc.next();
                            this.cold_and_beverages();
                            return; 
                        }
                        else{
                            int var_5 =sc.nextInt();
                            if (var_5 <= 0) {
                                    System.out.println("Invalid option...");
                                    this.cold_and_beverages();
                                    return;
                            }
                            else{
                                System.out.println("------------------------------");
                                switch(var_5){
                                    case 1:
                                        System.out.println("Iced Black Tea (The Classic).");
                                        break;
                                    case 2:
                                        System.out.println("Iced Earl Grey.");
                                        break;
                                    case 3:
                                        System.out.println("Southern Sweet Tea.");
                                        break;
                                    case 4:
                                        System.out.println("Green Tea Bases (Light & Grassy).");
                                        break;
                                    default:
                                        System.out.println("Sorry for the error.");
                                        this.cold_and_beverages();
                                        return;
                                }
                                System.out.println("------------------------------");
                            }
                        }
                    }
                    default ->{
                        System.out.println("Sorry for the error.");
                        this.cold_and_beverages();
                        return;
                    }
                }
                        
            }
        }
    }
}