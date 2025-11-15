import java.util.Scanner;
import java.util.*;

public class Array2D_1 {
    public static void main(String[] args) {
        A_2 var_2 = new A_2();
        var_2.printing();
    }
    
}

class A_2{
    public void printing(){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int i =0;i<3;i++){
            for (int j =0 ;j < 3 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(Arrays.deepToString(arr));

    }
}
