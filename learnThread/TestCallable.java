package learnThread;

import java.util.concurrent.*;

/**
 * 线程创建方式三：实现callable接口，重写call方法
 * callable的好处：
 * 1、可以定义返回值
 * 2、可以抛出异常
 * */

public class TestCallable implements Callable<Boolean> {

    private String url;
    private String name;

    public TestCallable(String url, String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为："+name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t = new TestCallable("https://pic3.zhimg.com/v2-806bd13eb33e8f754e2f4e403ea47603_1440w.jpg?source=172ae18b","dog1.jpg");
        TestCallable t1 = new TestCallable("https://pic3.zhimg.com/v2-806bd13eb33e8f754e2f4e403ea47603_1440w.jpg?source=172ae18b","dog2.jpg");
        TestCallable t2 = new TestCallable("https://pic3.zhimg.com/v2-806bd13eb33e8f754e2f4e403ea47603_1440w.jpg?source=172ae18b","dog3.jpg");

        // 创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        // 提交执行
        Future<Boolean> r1 = ser.submit(t);
        Future<Boolean> r2 = ser.submit(t1);
        Future<Boolean> r3 = ser.submit(t2);

        // 获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();

        // 关闭服务
        ser.shutdownNow();
    }
}
