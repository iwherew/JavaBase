package learnThread;

/**
 * 死锁：多个线程互相占有对方资源，然后形成僵持
 * */

public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0, "amadeus");
        Makeup g2 = new Makeup(1, "zzz");

        g1.start();
        g2.start();
    }
}

class Lipstick{

}

class Mirror{

}

class Makeup extends Thread{

    // 需要的资源只有一份，用static来保证只有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice;
    String name;

    Makeup(int choice, String name){
        this.choice = choice;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 互相持有对方的锁，就是需要拿到对方的资源
    private void makeup() throws InterruptedException {
        if(choice == 0){
            synchronized (lipstick){
                System.out.println(this.name + " get lipstick lock");
                Thread.sleep(1000);
//                synchronized (mirror){
//                    System.out.println(this.name + " get mirror lock");
//                }
            }
            synchronized (mirror){
                System.out.println(this.name + " get mirror lock");
            }
        }else{
            synchronized (mirror){
                System.out.println(this.name + " get mirror lock");
                Thread.sleep(2000);
//                synchronized (lipstick){
//                    System.out.println(this.name + " get lipstick lock");
//                }
            }
            synchronized (lipstick){
                System.out.println(this.name + " get lipstick lock");
            }
        }
    }
}
