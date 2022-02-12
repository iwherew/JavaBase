package controlStatement;

/**
 * break 终止整个循环
 * continue 终止本轮循环，不执行本次循环的剩余代码
 * */

public class TestBreak {
    public static void main(String[] args) {
        int total = 0;
        while(true){
            total ++;
            int i = (int)(100 * Math.random());
            System.out.println(i);
            if(i == 88){
                break;
            }
        }
        System.out.println("run " + total + " times");
    }
}
