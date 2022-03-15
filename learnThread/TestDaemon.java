package learnThread;

/**
 * 守护线程
 * 虚拟机必须确保用户线程执行完毕
 * 虚拟机不用等待守护线程执行完毕，用户线程跑完后守护线程还在跑
 * */

public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        Person person = new Person();

        Thread thread = new Thread(god);
        thread.setDaemon(true); // 默认是false，表示用户线程，设置为true表示守护线程
        thread.start();

        new Thread(person).start(); // 用户线程启动
    }
}

class God implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("god");
        }
    }
}

class Person implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("live");
        }
        System.out.println("====die====");
    }
}