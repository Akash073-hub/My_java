package Arrays;

import java.util.ArrayList;

public class array_6 {
    public static void main(String[] args) {
        E_1 var_1 = new E_1();
        var_1.reversing();
    }
    
}

class E_1{
    void reversing(){
        ArrayList <Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(50);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        System.out.println(arr);
        System.out.println(arr.reversed());
    }
}
