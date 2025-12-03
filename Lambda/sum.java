public class sum {
    static void main() {
        sum_1 var_1 = (a,b) -> a+b ;
        System.out.println(var_1.sum(12,12));
    }
}

@FunctionalInterface
interface sum_1{
    int sum(int a,int b);
}