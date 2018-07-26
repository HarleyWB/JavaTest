package Test;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.CountDownLatch;


class TestLock {
static CountDownLatch latch=new CountDownLatch(10);
    private static HashMap map = new HashMap();
int M=1000000;
    public TestLock() {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.put(new Integer(i), i);
                }
                System.out.println("t1 over");
                latch.countDown();
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.put(new Integer(i), i);
                }
                latch.countDown();
                System.out.println("t2 over");
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.put(new Integer(i), i);
                }
                latch.countDown();
                System.out.println("t3 over");
            }
        };

        Thread t4 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.put(new Integer(i), i);
                }
                latch.countDown();
                System.out.println("t4 over");
            }
        };

        Thread t5 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.put(new Integer(i), i);
                }
                latch.countDown();
                System.out.println("t5 over");
            }
        };

        Thread t6 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.get(new Integer(i));
                }
                latch.countDown();

                System.out.println("t6 over");
            }
        };

        Thread t7 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.get(new Integer(i));
                }
                latch.countDown();
                System.out.println("t7 over");
            }
        };

        Thread t8 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.get(new Integer(i));
                }
                latch.countDown();
                System.out.println("t8 over");
            }
        };

        Thread t9 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.get(new Integer(i));
                }
                latch.countDown();
                System.out.println("t9 over");
            }
        };

        Thread t10 = new Thread() {
            public void run() {
                for (int i = 0; i < M; i++) {
                    map.get(new Integer(i));
                }
                latch.countDown();
                System.out.println("t10 over");
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }

    public static void main(String[] args) throws InterruptedException {
        new TestLock();
   latch.await();

        System.out.println(map.size());
    }
}