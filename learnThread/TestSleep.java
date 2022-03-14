package learnThread;

/**
 * 模拟倒计时
 * */

public class TestSleep{
    public static void main(String[] args) throws InterruptedException {
        tenDown();
    }

    public static void tenDown() throws InterruptedException{
        int num = 10;
        while(true){
            System.out.println(num--);
            if(num <= 0){
                break;
            }
            Thread.sleep(1000);
        }
    }
}
