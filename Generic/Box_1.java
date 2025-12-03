public class Box_1<T extends Number> {

    void add(T a, T b) {
        double result = a.doubleValue() + b.doubleValue();
        System.out.println("Addition: " + result);
    }

    public static void main(String[] args) {
        Box_1<Integer> intBox = new Box_1<>();
        intBox.add(10, 20);

        Box_1<Double> doubleBox = new Box_1<>();
        doubleBox.add(5.5, 4.5);

        Box_1<Float> floatBox = new Box_1<>();
        floatBox.add(3.2f, 2.8f);
    }
}