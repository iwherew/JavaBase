package learnThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyThread3());
        new Thread(futureTask).start();
        Integer result = futureTask.get();
        System.out.println(result);
    }
}

class MyThread3 implements Callable {
    @Override
    public Integer call() throws Exception {
        System.out.println("callable");
        return 100;
    }
}
