package method;

/**
 *  递归
 * */

public class TestRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    // 阶乘
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

}
