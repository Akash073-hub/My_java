class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("Thread A is running.");
        try {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread A was interrupted.");
        }
        System.out.println("Thread A has finished.");
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        System.out.println("Thread B is running.");
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread B was interrupted.");
        }
        System.out.println("Thread B has finished.");
    }
}

public class join {
    public static void main(String[] args) {

        ThreadA threadA = new ThreadA();


        ThreadB threadB = new ThreadB();


        threadA.start();

        try {
            threadA.join();
            System.out.println("Thread A has completed. Now starting Thread B.");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted while waiting for Thread A.");
        }

        threadB.start();
    }
}