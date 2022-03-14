package learnThread;

/**
 * 创建线程方式一：
 * 继承Thread + 重写run,调用start 开启线程
 *
 * 注意：线程开启不一定执行，由CPU调度执行
 * */

public class StartThread extends Thread{
    /**
     * 线程入口点
     * */
    @Override
    public void run() {
        // run 方法线程体
        for(int i = 0; i < 100; i++){
            System.out.println("learning---------");
        }
    }

    public static void main(String[] args) {
        // main 线程， 主线程

        // 创建一个线程对象
        StartThread st = new StartThread();
        // 调用start() 方法，开启线程, start 方法和主线程同时执行
        // 多条执行路径，主线程和子线程并行交替执行
        st.start();
        // run() 方法按照先后顺序执行，只有主线程一条路径
//        st.run();
        for(int i = 0; i<500;i++){
            System.out.println("coding");
        }
    }
}
