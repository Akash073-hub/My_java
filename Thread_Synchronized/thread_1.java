public class thread_1{
    static void main(String[] args) {
        threads var_1 = new threads();

        Thread t1 = new Thread(var_1);
        Thread t2 = new Thread(var_1);

        t1.start();
        t2.start();
    }
}

class threads implements Runnable{
    @Override
    public void run(){
        for (int i =0;i<=5;i++){
            System.out.println(i);
        }
    }
}