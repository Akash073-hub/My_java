public class inheritance {
    void the(int a,int b){
        System.out.println(a+b);
    }            
}
class A_3 extends inheritance{
    void ok(int a,int b){
        System.out.println(a*b);
        super.the(a,b);
    }
    public static void main(String[] args){
        A_3 var_1 = new A_3();
        var_1.ok(2,3);
    }
}
