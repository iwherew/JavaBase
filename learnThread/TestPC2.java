package learnThread;

/**
 * 生产者消费者问题： 信号灯法：标志位解决
 * */

public class TestPC2 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}


// 生产者
class Player extends Thread{
    TV tv;

    public Player(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                this.tv.play("" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 消费者
class Watcher extends Thread{
    TV tv;

    public Watcher(TV tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                tv.watch();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 产品
class TV{
    String voice;
    boolean flag = true;

    public synchronized void play(String voice) throws InterruptedException {
        if(!flag){
            this.wait();
        }
        System.out.println("play " + voice);
        this.voice = voice;
        this.flag = !this.flag;
        this.notifyAll();
    }

    public synchronized void watch() throws InterruptedException {
        if(flag){
            this.wait();
        }
        System.out.println("watch " + this.voice);
        this.flag = !this.flag;
        this.notifyAll();
    }

}