package learnThread;

/**
 * 观察测试线程的状态
 * */

public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
           for(int i = 0; i<5;i++){
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("--------");
           }
        });

        // 观察状态
        Thread.State state = thread.getState();
        System.out.println(state); // NEW

        // 观察启动后
        thread.start();
        state = thread.getState();
        System.out.println(state); // RUNNABLE

        while(state != Thread.State.TERMINATED){ // 只要线程不终止，就一直输出状态
            Thread.sleep(200);
            state = thread.getState(); // 更新线程状态
            System.out.println(state); // 输出状态
        }

        // IllegalThreadStateException
        // 线程一旦进入死亡状态，就不能再次启动
//        thread.start();
    }
}
