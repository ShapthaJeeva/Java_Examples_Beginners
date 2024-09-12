package extendthreadclass;

class FirstThreadClass extends Thread {
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("FirstThreadClass"+i);
        }
    }
}

class SecondThreadClass extends Thread {
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("SecondThreadClass"+i);
        }
    }
}

public class ExtendThreadClass {
    public static void main (String argv[]) {
        FirstThreadClass c1 = new FirstThreadClass();
        SecondThreadClass c2 = new SecondThreadClass();
        c1.start();
        c2.start();
    }
}