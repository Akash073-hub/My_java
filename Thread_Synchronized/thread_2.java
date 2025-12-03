public class thread_2{
    static void main() {
        threads_1 var_1 = new threads_1();

        Thread t1 = new Thread(var_1);
        Thread t2 = new Thread(var_1);
        Thread t3 = new Thread(var_1);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}

class threads_1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }

}