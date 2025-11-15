package Arrays;

import java.util.*;
public class array_6_1 {
    public static void main(String[] args) {
        F_1 var_1 = new F_1();
        var_1.reversing();
    }
    
}

class F_1{
    void reversing(){
        int arr [] = {1,2,3,4,55,6,2};
        System.out.println(Arrays.toString(arr));
        int m = arr.length;
        int arr_2[] = new int[m];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr_2[j] = arr[i];  
        }
        System.out.println(Arrays.toString(arr_2));
    }
}
