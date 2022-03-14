package learnThread;

/**
 * 创建线程方式2： 实现Runnable接口，重写run方法
 * 执行线程需要丢入Thread接口实现类，调用start方法
 * */

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        // run 方法线程体
        for(int i = 0; i < 100; i++){
            System.out.println("learning---------");
        }
    }
    public static void main(String[] args) {
        // 创建 Runnable 接口的实现类对象
        TestRunnable tr = new TestRunnable();

        // 创建线程对象，通过线程对象来开启我们的线程，静态代理
        new Thread(tr).start();

        for(int i = 0; i<500;i++){
            System.out.println("coding");
        }
    }
}
