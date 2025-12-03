package Static;

public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }

    static void main() {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Number of Counter instances created: " + Counter.count);
    }
}
