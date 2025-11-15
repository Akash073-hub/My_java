import java.util.Arrays;
import java.util.Scanner;

public class Array2D_3 {
    public static void main(String[] args) {
        the var_2 = new the();
        var_2.transpose();
    }
    
}

class the{
    void transpose(){
        int arr [][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i < 3;i++){
            for (int j = 0;j< 3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int arr_1[][] = new int[3][3];
        for (int i=0;i < 3;i++){
            for (int j = 0;j< 3;j++){
                arr_1[j][i] += arr[i][j];
            }
        }        
        System.out.println(Arrays.deepToString(arr_1));
    }
}
