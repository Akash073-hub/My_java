public class inheritance {
    void the(int a,int b){
        System.out.println(a+b);
    }            
}
class A extends inheritance{
    void ok(int a,int b){
        System.out.println(a*b);
        super.the(a,b);
    }
    public static void main(String[] args){
        A var_1 = new A();
        var_1.ok(2,3);
    }
}
