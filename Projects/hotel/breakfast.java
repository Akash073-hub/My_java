package hotel;
import java.util.Scanner;
import java.lang.System;


public class breakfast{
    public static void main(String[] args) {
        A var_2=new A();
        var_2.Breakfast();
    }
}
class A{
    void Breakfast(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Waiting for the order......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("sorry for the error");
            this.Breakfast();
            return;
        }
        System.out.println("What would like to have ");
        System.out.printf("%-18s %10s%n","1.Dosa."," - 40-60");
        System.out.printf("%-18s %10s%n","2.Pasta."," - ");
        System.out.printf("%-18s %10s%n","3.Waffels."," - ");
        System.out.printf("%-18s %10s%n","4.Idli and vada."," - ");
        System.out.printf("%-18s %10s%n","5.Scrambled eggs, bacon and sausages."," - ");
        System.out.printf("%-18s %10s%n","6.Toast with butter & jam."," - ");
        System.out.printf("%-18s %10s%n","7.Baked beans."," - ");
        System.out.println("---------------------------");
        if (!sc.hasNextInt()){
            System.out.println("Please enter the integer number from 1 to 7.");
            sc.next();
            this.Breakfast();
            return;
        }
        else{
            int var_2 =sc.nextInt();
            if (var_2 <= 0) {
                System.out.println("Invalid option...");
                this.Breakfast();
                return;
            }
            else{
                System.out.println("----------------------------");
                switch(var_2){
                    case 1->{
                    System.out.println("Waiting for the order......");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Sorry for the error.");
                        this.Breakfast();
                        return;
                    }
                    System.out.println("Which kind of Dosa you want? ");
                    System.out.printf("%-18s %10s%n","1.Rava Dosa."," - 40");
                    System.out.printf("%-18s %10s%n","2.Masala Dosa."," - 60");
                    System.out.printf("%-18s %10s%n","3.Plan Dosa."," - 40");
                    System.out.printf("%-18s %10s%n","4.Ghee Dosa."," - 50");
                    System.out.printf("%-18s %10s%n","5.Mysore Masala Dosa."," - 50");
                    System.out.println("---------------------------");
                    if (!sc.hasNextInt()){
                        System.out.println("Please enter the integer number from 1 to 5.");
                        sc.next();
                        this.Breakfast();
                        return; 
                    }
                    else{
                        int var_3 =sc.nextInt();
                        if (var_3 <= 0) {
                            System.out.println("Invalid option...");
                            this.Breakfast();
                            return;
                        }
                        else{
                    System.out.println("---------------------------");
                    switch (var_3) {
                        case 1:
                            System.out.println("Rava Dosa.");
                            break;
                        case 2:
                            System.out.println("Masala Dosa.");
                            break;
                        case 3:
                            System.out.println("Plan Dosa.");
                            break;
                        case 4:
                            System.out.println("Ghee Dosa.");
                            break;
                        case 5:
                            System.out.println("Mysore Masala Dosa.");
                            break;
                        default :{
                            System.out.println("Sorry for the disturb");
                            this.Breakfast();
                            return;
                        }
                    }
                        }
                    }
                }
                case 2->{
                    System.out.println("Waiting for the order.....");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("sorry for the error");
                        this.Breakfast();
                        return;
                    }
                    System.out.println("Which kind of Pasta you want?");
                    System.out.println("1.White Sauce Pasta selected - Creamy and rich.");
                    System.out.println("2.Red Sauce Pasta selected - Tangy tomato base.");
                    System.out.println("3.Alfredo Pasta selected - Cheesy and delicio.");
                    System.out.println("---------------------------");
                    if (!sc.hasNextInt()){
                        System.out.println("Please enter the integer number from 1 to 3.");
                        sc.next();
                        this.Breakfast();
                        return; 
                    }
                    else{
                        int var_4 =sc.nextInt();
                        if (var_4 <= 0) {
                            System.out.println("Invalid option...");
                            this.Breakfast();
                            return;
                        }
                        else{
                    System.out.println("---------------------------");
                    switch(var_4){
                        case 1:
                            System.out.println("White Sauce Pasta selected - Creamy and rich.");
                            break;
                        case 2:
                            System.out.println("Red Sauce Pasta selected - Tangy tomato base.");
                            break;
                        case 3:
                            System.out.println("Alfredo Pasta selected - Cheesy and delicio.");
                            break;
                        default:
                            System.out.println("Sorry for the disturb.");
                            this.Breakfast();
                            return;
                    }
                        }
                    }
                }
                    case 3 ->
                        System.out.println("Waffels.");
                    case 4 ->
                        System.out.println("Idli and vada.");
                    case 5 ->
                        System.out.println("Scrambled eggs, bacon and sausages.");
                    case 6 ->
                        System.out.println("Toast with butter & jam.");
                    case 7 ->
                        System.out.println("Baked beans.");
                    default ->{
                        System.out.println("Sorry for the disturb.");
                        this.Breakfast();
                        return;
                    }
                }
        System.out.println("----------------------------");
            }
        }
    }
}
