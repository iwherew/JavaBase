package learnClass;

/**
 * 匿名内部类
 * 只使用一次的类，不声明名字
 * */

public class TestAnonymousInnerClass {
    public static void test(Anonymous a){
        a.move();
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass.test(new Anonymous() {
            @Override
            public void move() {
                System.out.println("move");
            }
        });
    }
}

interface Anonymous{
    void move();
}
