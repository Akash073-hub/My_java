

import java.util.Arrays;
import java.util.Scanner;

public class Array2D_4 {
    public static void main(String[] args) {
        ok var_1 = new ok();
        var_1.add();
    }
}
class ok{
    void add(){
        Scanner sc = new Scanner(System.in);
        int arr_1 [] [] = new int[3][3];
        int arr_2 [] [] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr_1[i][j] = sc.nextInt();
            }
            
        }
        System.out.println(Arrays.deepToString(arr_1));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr_2[i][j] = sc.nextInt();
            }
            
        }
        System.out.println(Arrays.deepToString(arr_2));
        int arr_3[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr_3[i][j] = arr_1[i][j]+ arr_2[i][j];
            }
            
        }
        System.out.println(Arrays.deepToString(arr_3));
    }
}