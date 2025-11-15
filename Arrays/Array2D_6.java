import java.util.Arrays;
import java.util.Scanner;

public class Array2D_6{
    public static void main(String[] args) {
        itis var_1 = new itis();
        var_1.daigonal();
    }
}

class itis{
    void daigonal(){
        Scanner sc = new Scanner(System.in);
        int arr_1[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr_1[i][j] = sc.nextInt();
            }
            
        }
        System.out.println(Arrays.deepToString(arr_1));
        int sum =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j){
                    sum += arr_1[i][j];
                }
            }
            
        }
        System.out.println(sum);
    }
}