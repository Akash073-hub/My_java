import com.sun.source.tree.SynchronizedTree;

public class sync {
    static void main() {
        Count C = new Count();

        Thread t1 = new Thread(C);
        Thread t2 = new Thread(C);

        t1.start();
        t2.start();
    }
}
class Count implements Runnable{
    @Override
    public synchronized void run(){
        int count = 0;
        for(int i=0;i<1000;i++){
            count++;
        }
        System.out.println(count);

    }

}
