package Test;


import java.util.concurrent.*;

class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = new ThreadPoolExecutor(5, 5, 0, TimeUnit.SECONDS,
                new SynchronousQueue<>(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setDaemon(true);
                System.out.println("create");
                return t;
            }
        });
        es.submit(new MyTask("A"));

    }

    public static class MyTask implements Runnable {
        public String name;

        public MyTask(String name) {
            this.name = name;

        }

        @Override
        public synchronized void run() {
            System.out.println("Thread ID " + Thread.currentThread().getId() + " " + name);

        }
    }
}