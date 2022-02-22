package learnClass;

/**
 * 接口
 * 接口里的方法都是抽象的，只定义规范，
 * 比抽象类还抽象，因为抽象类可以写实现的具体代码
 * 一个接口可以继承多个接口
 * 接口里只有常量和方法，没有变量
 * 访问修饰符只能是 public 和 default
 * 常量：总是 public static final 修饰，不显式声明也是，可省略
 * 方法：总是 public abstract 修饰，不显式声明也是，可省略
 * */

public interface TestInterface {
    int MAX_AGE = 100;
//    相当于
//    public static final int MAX_AGE = 100;

    void move();
//    相当于
//    public abstract void move();
}
