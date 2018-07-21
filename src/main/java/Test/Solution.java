package Test;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;

public class Solution {

    public static String obj1 = "obj1";
    public static String obj2 = "obj2";
    static CountDownLatch latch = new CountDownLatch(2);



    public static void main(String[] args) throws Exception {
        Thread a = new Thread(new Lock1(latch));
        Thread b = new Thread(new Lock2(latch));
        a.setName("A线程");
        b.setName("B线程");
        a.start();
        b.start();
       latch.await();

        System.out.println("main thread");
    }
}

class Lock1 implements Runnable {

    private CountDownLatch latch = null;

    public Lock1(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(1);
        }
        latch.countDown();
    }
}

class Lock2 implements Runnable {

    private CountDownLatch latch = null;

    public Lock2(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(2);
        }
        latch.countDown();

    }

}

