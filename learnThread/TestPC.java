package learnThread;


/**
 * 生产者消费者模型 --> 利用缓冲区解决： 管程法
 * */

// 生产者 消费者 产品 缓冲区
public class TestPC {
    public static void main(String[] args) {
        SyncContainer container = new SyncContainer();

        new Producer(container).start();
        new Consumer(container).start();

    }
}

// 生产者
class Producer extends Thread{
    SyncContainer container;

    public Producer(SyncContainer container){
        this.container = container;
    }

    // 生产
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                container.push(new Chicken(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产："+i);
        }
    }
}

// 消费者
class Consumer extends Thread{
    SyncContainer container;

    public Consumer(SyncContainer container){
        this.container = container;
    }

    // 消费
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("消费："+container.pop().id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 产品
class Chicken{
    int id;

    public Chicken(int id){
        this.id = id;
    }
}

// 缓冲区
class SyncContainer{
    // 容器大小
    Chicken[] chickens = new Chicken[10];

    // 容器计数器
    int count = 0;

    // 生产者放入产品
    public synchronized void push(Chicken chicken) throws InterruptedException {
        // 如果容器满了，就需要等待消费者消费
        if(count == chickens.length - 1){
            // 通知消费者消费，生产等待
            this.wait();
        }
        // 如果没有满，我们需要丢入产品
        chickens[count] = chicken;
        count++;
        // 通知消费者消费
        this.notifyAll();
    }

    // 消费者消费产品
    public synchronized Chicken pop() throws InterruptedException {
        // 判断是否能消费
        if(count == 0){
            // 等待生产者生产，消费者等待
            this.wait();
        }
        count--;
        // 如果可以消费
        Chicken chicken = chickens[count];

        // 通知生产者生产
        this.notifyAll();

        return chicken;
    }
}