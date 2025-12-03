public class Box <T>{
    T value ;
    public Box(T value){
        this.value = value;
    }

    static void main() {
        Box <Integer> intBox = new Box<>(123);

        System.out.println("Integer Value: " + intBox.value);
    }

}