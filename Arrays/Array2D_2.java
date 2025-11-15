import java.util.Scanner;

public class Array2D_2 {
    public static void main(String[] args) {
        B_1 var_2 = new B_1();
        var_2.sums();
    }
}

class B_1 {
    void sums() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Row sums:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + i + " = " + rowSum);
        }

        System.out.println("Column sums:");
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Column " + j + " = " + colSum);
        }
    }
}
