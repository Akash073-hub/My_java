import java.sql.SQLOutput;

@FunctionalInterface
interface Sayable_1 {
    void say();
}
public class Sayable{
    static void main() {
        Sayable_1 var_1 = () -> System.out.println("yooo");
        var_1.say();
    }
}