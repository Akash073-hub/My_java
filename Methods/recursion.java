import java.util.Scanner;
public class recursion {
    int factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        recursion var_1 =new recursion();
        System.out.println(var_1.factorial(n));
    }
}