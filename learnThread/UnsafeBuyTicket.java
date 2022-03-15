package learnThread;

/**
 * 多个线程同时操作一个对象
 * 问题：多个线程同时操作一个资源的情况下，线程不安全，数据紊乱
 * */
public class UnsafeBuyTicket implements Runnable{
    private int ticketNums = 10;

    @Override
    // 解决方法 在方法加 synchronized
//    public synchronized void run() {
    public void run() {
        while(true){
            if(ticketNums<=0){
                break;
            }
            // 模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        UnsafeBuyTicket ticket = new UnsafeBuyTicket();

        new Thread(ticket,"小明").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛党").start();
    }
}
