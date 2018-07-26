package Test;
import com.google.common.util.concurrent.RateLimiter;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

class Rate implements Runnable{

    public static AtomicInteger integer=new AtomicInteger(0);
    static private RateLimiter limiter=RateLimiter.create(100);
    public  void run(){
        if(limiter.tryAcquire()){
            System.out.println(Thread.currentThread().getName()+"执行");
            integer.addAndGet(1);
        }else {
            System.out.println(Thread.currentThread().getName()+" 未执行");
        }

    }
}

class Solution{

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            new  Thread(new Rate()).start();
        }
        Thread.sleep(3000);
        System.out.println(Rate.integer);


    }
}