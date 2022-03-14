package learnThread;

// 模拟龟兔赛跑
public class Race implements Runnable{
    private static String winner;

    @Override
    public void run() {
        for(int i = 0; i<=10000;i++){
            if(Thread.currentThread().getName().equals("兔子") && i%1000 == 0){
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            boolean flag = gameOver(i);
            if (flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
        }
    }

    private boolean gameOver(int steps){
        if(winner != null){
            return true;
        }
        if(steps >= 10000){
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + Thread.currentThread().getName());
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }
}
