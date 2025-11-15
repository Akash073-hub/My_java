public class array {
    public static void main(String[] args) {
        A_1 obj = new A_1();
        obj.the();
    }
    
}
class A_1{
    void the(){
        int [] arr = {1,2,3,4,5,5,6};
        int small = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        for ( int i : arr){
            if(small > i){
                j = small;
                small = i ;
            }
            else if(i > small && i < j){
                j = i;                
            }
        }
            System.out.println(j);
    }
        
}