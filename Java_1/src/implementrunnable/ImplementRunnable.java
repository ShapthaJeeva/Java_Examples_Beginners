package implementrunnable;

class RunnableThread implements Runnable {
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class ImplementRunnable {
    public static void main (String argv[]) {
        RunnableThread t = new RunnableThread();
        Thread t1 = new Thread(t,"Thread 1");
        Thread t2 = new Thread(t, "Thread 2");
        t1.start();
        t2.start();
    }
}
