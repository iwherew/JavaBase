package method;

/**
 *  重载
 * */

public class TestOverload {
    public static void main(String[] args) {
        show(1);
        show(1,2);
        show(1.0,2);
    }

    public static void show(int n1){
        System.out.println("第一个");
    }

    // 方法名相同，参数个数不同，构成重载
    public static void show(int n1, int n2){
        System.out.println("第二个");
    }

    // 方法名相同，参数类型不同，构成重载
    public static void show(double n1, int n2){
        System.out.println("第三个");
    }

    // 编译错误，只有返回值不同，不构成重载
//    public static int show(int n1){
//        System.out.println("第一个");
//        return 1;
//    }

    // 编译错误，只有参数名称不同，不构成重载
//    public static void show(int n2, int n1){
//        System.out.println("第二个");
//    }

}
