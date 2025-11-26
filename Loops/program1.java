public class program1 {
    static void main() {
        pattern obj = new pattern();
    }
}
class design {
    public synchronized void patterns() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class pattern implements  Runnable{
    design obj_1 = new design();
    @Override
    public void run() {
        obj_1.patterns();
    }
}
