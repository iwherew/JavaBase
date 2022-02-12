package controlStatement;

public class TestIf {
    public static void main(String[] args) {
        double d = Math.random(); // [0,1)
        System.out.println(d);

        int i = (int)(6 * Math.random())+1;
        if(i <= 3){
            System.out.println("小");
        }else if(i == 6){
            System.out.println("6");
        }else{
            System.out.println("大");
        }
    }
}
