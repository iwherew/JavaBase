package learnClass;

/**
 *  抽象类
 *  没有方法体，只有声明
 *  告诉子类必须要给抽象方法的具体实现，可以严格限制子类设计，使子类更加通用
 *
 *  注意：
 *  1、有抽象方法的泪只能定义成抽象类
 *  2、抽象类不能实例化，即不能用new来实例化抽象类
 *  3、抽象类可以包含属性、方法、构造方法，只能用来被子类调用
 *  4、抽象类只能用来被继承
 *  5、抽象方法必须被子类实现
 * */

public class TestAbstract {

}

abstract class Animal{
    abstract public void move();
}

class People extends Animal{
    public void move(){
        System.out.println("walk");
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("run");
    }
}
