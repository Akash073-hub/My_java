import java.util.*;
import java.lang.System;


public class finding_max_and_min {
    static void main() {
        min_max  var_3 = new min_max();
        var_3.max_min();

    }
}

class min_max{
    int[] scores = {84, 92, 76, 90, 88, 95, 73, 89};
    int max =0;
    int min = Integer.MAX_VALUE;
    int sum =0;

    void max_min() {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        for(int j: scores){
            sum += j;
        }
        double avg = (sum/(scores.length));
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        System.out.println("The average number is: " + avg);
    }
}