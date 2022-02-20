package learnClass;

public class TestSuper {
    public static void main(String[] args) {
        new ChildClass().f();
    }
}

class FatherClass{
    public int value;

    public FatherClass(){
        System.out.println("create father class");
    }

    public FatherClass(int i){
        System.out.println("create father class 2");
    }

    public void f(){
        value = 100;
        System.out.println("FatherClass: " + value);
    }
}

class ChildClass extends FatherClass{
    public int value;

    public ChildClass(){
        // 第一句默认super()，编译器会自动生成，先调用父类的构造方法
        // super();
        // 显式调用可传参数，控制调用父类的哪个构造方法
        super(1);
        System.out.println("create child class");
    }

    @Override
    public void f(){
        super.f(); // 调用父类方法
        value = 200;
        System.out.println("ChildClass: " + value);
        System.out.println(value);
        System.out.println(super.value); // 调用父类对象的成员变量
    }
}
