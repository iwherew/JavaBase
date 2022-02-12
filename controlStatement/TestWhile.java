package controlStatement;

public class TestWhile {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while(i <= 100){
            count += i;
            i++;
        }
        System.out.println(count);
    }
}
