public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getkey(){
        return key;
    }
    public V getvalue(){
        return value;
    }
    @Override
    public String toString(){
        return "Key: " + key + ", Value: " + value;
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;



    }

    static void main() {
        Pair<String, Integer> student = new Pair<>("Rahul", 101);
        System.out.println("Student Pair: " + student);
        System.out.println("Max Integer: " + max(10, 25, 17));
        System.out.println("Max String: " + max("apple", "mango", "banana"));
    }
}