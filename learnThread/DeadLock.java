package learnThread;

/**
 * 死锁：多个线程互相占有对方资源，然后形成僵持
 * */

public class DeadLock {

}

class Lipstick{

}

class Mirror{

}

class Makeup extends Thread{
    static Lipstick lipstick = new Lipstick();
    @Override
    public void run() {
    }
}
