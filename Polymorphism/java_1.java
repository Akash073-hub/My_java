import java.util.Scanner;
public class java_1 {
    int the(int a,int b){
        return a+b;
    }
    String the(String a,String b){
        return a + " " + b;
    }
    public static void main(String[] args){
        java_1 is = new java_1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(is.the(a,b));
        // System.out.println(is.the("the","is"));
    }
}

// list a = [12, 13, 67, 89, 22]
// map m={12:3, 13:4, 67:5, 89:6, 22:7}
// for i in range(len(a)):
    