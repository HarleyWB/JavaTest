package JdkThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private static volatile int i = 0;
    private Lock lock = new ReentrantLock();
    private int[] accounts;


    public Bank() {

    }

    public void add() {

        lock.lock();
        try {

            System.out.println(++i);
        } finally {
            lock.unlock();
        }
    }

    public int getSize() {
        return accounts.length;
    }
}
