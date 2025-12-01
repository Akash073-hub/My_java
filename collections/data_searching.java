import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;

public class data_searching {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int n =5;
        for(int i=0;i<n;i++) {
            String name =  sc.nextLine();
            names.add(name);
        }
        System.out.println(names);
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<names.size();i++) {
            String name = names.get(i);
            map.put(name , i);
        }

        Collections.sort(names);
        System.out.println("Students (A–Z): " + map);

        int kal = Collections.max(map.values());
        System.out.println(kal);

        names.remove("rahul");
        map.remove("rahul");

        System.out.println(names);
        System.out.println(map);

    }
}
