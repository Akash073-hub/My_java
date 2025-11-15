package Arrays;

public class array_4 {
    public static void main(String[] args) {
        C_1 var_1 = new C_1();
        var_1.max_min();
    }
    
}
class C_1{
    void max_min(){
        int  [] arr = {1,2,3,4,5};
        int max = arr[0];
        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            }
            System.out.println(max);
            System.out.println(min);
        }
    }

