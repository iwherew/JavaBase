package learnThread;

// concurrent 并发包
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 测试JUC安全类型的集合
 * */

public class TestJUC {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }

        Thread.sleep(2000);
        System.out.println(list.size());
    }
}
