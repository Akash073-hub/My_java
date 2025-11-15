import java.util.Arrays;
import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {
        B_2 var_1 = new B_2();
        var_1.sum(10);
    }
}

class B_2{
    Scanner sc = new Scanner(System.in);
    void sum(int n){
        int m = 100;
        int sum = 0;
        int arr [] = new int[m];
        for (int i=0;i<n;i++){
            arr [i] = sc.nextInt();            
        }
        System.out.println(Arrays.toString(arr));
        for (int j : arr){
            sum += j;
        }
        System.out.println(sum);
    }
}
