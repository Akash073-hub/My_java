package Advanced_Bank_Account_Processor;

import java .util.*;


public class ABAP {
    static void main() {
        Set<Integer> accountSet = new HashSet<>();
        Map<Integer, String> accountMap = new HashMap<>();
        Map<Integer, String> sortedMap = new TreeMap<>(accountMap);
        Iterator<Map.Entry<Integer, String>> it = sortedMap.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}

abstract class Transaction {
    abstract void process(double amount);

}
