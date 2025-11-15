import java.util.Arrays;
import java.util.Scanner;
public class array_2 {
    public static void main(String[] args) {
        arrays a = new arrays();
        a.array_input(10);
    }
    
}
class arrays{
    Scanner sc = new Scanner(System.in);
    int m = 10;
    int arr []= new int[m];
    void array_input(int n){
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
