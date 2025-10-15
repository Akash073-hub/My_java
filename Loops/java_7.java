import java.util.*;
public class java_7 {
    public static void main(String[] args) {
    A var_1 = new A();
    var_1.display();
    }

}
class A{
    int [][]arr = {{1,2,3},
    {4,5,6},
     {7,8,9}};
    void display() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}