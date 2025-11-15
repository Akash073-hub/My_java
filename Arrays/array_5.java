package Arrays;

public class array_5 {
    public static void main(String[] args) {
        D_1 var_1 = new D_1();
        var_1.counting();    
    }
}

class D_1{
    void counting(){
        int even = 0;
        int odd = 0;
        int arr [] = {1,2,3,4,5,6};
        for (int i : arr){
            if (i%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
