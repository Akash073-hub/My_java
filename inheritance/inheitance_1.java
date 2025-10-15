public class inheitance_1 {
    int a;
    int b;
    void add(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }   
}
class A extends inheitance_1{
    @Override
    void add(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b+a);
    }
    public static void main(String[] args){
        A var_1 =new A();
        var_1.add(2,3);
    }
}