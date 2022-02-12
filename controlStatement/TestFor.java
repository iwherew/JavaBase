package controlStatement;

public class TestFor {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i <= 100; i++){
            count += i;
        }
        System.out.println(count);

        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                if(i>=j){
                    System.out.print(i+"*"+j+"="+i*j+"\t");
                }
            }
            System.out.println(" ");
        }
    }
}
