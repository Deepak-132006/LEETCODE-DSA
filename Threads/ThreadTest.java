package Threads;

public class ThreadTest {

    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sb.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sb.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected: 20000");
        System.out.println("Actual:   " + sb.length());
    }
}