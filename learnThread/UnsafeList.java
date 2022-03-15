package learnThread;

// 线程不安全的集合

import java.util.ArrayList;
import java.util.List;

public class UnsafeList {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                synchronized (list){ // 锁list 同步块
                    list.add(Thread.currentThread().getName()); // 多个线程操作同一个位置
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println(list.size());
    }
}
