package JdkThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallableTest implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return 110;
    }
}

public class Test {

    private static FutureTask<Integer> futureTask = new FutureTask<Integer>(new CallableTest());

    public static void test() {
        int i = 0;
        int j = 0;

    }

    public static void main(String[] args) throws Exception {
        futureTask.run();
        int i = 0;

        test();
        System.out.println(futureTask.get());
    }

}
