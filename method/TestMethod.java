package method;

/**
 *  方法的基本使用
 * */

public class TestMethod {
    public static void main(String[] args) {
        // 通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.printString();
        tm.printString();
        System.out.println(tm.add(4,6));
    }

    void printString(){
        System.out.println("test1");
        System.out.println("test2");
    }

    int add(int a, int b){
        // return 的两个作用
        // 1、结束方法的运行
        // 2、返回值
        return a+b;
    }
}
