import java.util.ArrayList;
import java.util.Collections;

public class Sorting_string {
    static void main() {
        ArrayList<String> list_1 = new ArrayList<>();
        list_1.add("apple");
        list_1.add("kiwi");
        list_1.add("banana");
        list_1.add("grape");
        list_1.add("mango");

        Collections.sort(list_1 , (s1,s2) -> s1.compareTo(s2));

        System.out.println(list_1);
    }
}


class ok_1{
    String name_1;
    public ok_1(String name_1){
        this.name_1 = name_1;
    }
}
@FunctionalInterface
interface lengths{
    void lengths(ok obj);
}


