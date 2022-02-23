package learnClass;

/**
 *  非静态内部类
 * */

public class TestInnerClass {
    public static void main(String[] args) {
        // 创建内部类对象
        // 先创建类对象，再创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

class Outer {
    private int age = 10;
    public void testOuter(){}

    class Inner{
        int age = 20;

        public void show(){
            // 访问外部类属性
            System.out.println("outer age : " + Outer.this.age);
            // 访问内部类属性
            System.out.println("inner age : " + this.age);
            System.out.println("inner age : " + age);
        }
    }
}
