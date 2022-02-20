package learnClass;

/**
 *  测试封装
 *  使用范围：
 *  public:     所有类
 *  protected   本类、本包、子类
 *  default     本类、本包
 *  private     本类
 *
 *  开发时，属性都是private，提供set和get方法，方法用public
 * */

/**
 *  final
 *  修饰变量：变量不可改变，一旦赋初始值，不能被重新赋值
 *  修饰方法：该方法不能被子类重写（方法名相同、参数相同），可以被重载（方法名相同、参数不同）
 *  修饰类：不能被继承，如：Math、String
 * */

public class TestEncapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        // 编译错误：age 在 learnClass.Human 中是 private 访问控制
//        System.out.println(h.age);
        h.name = "Amadeus";

        Boy b = new Boy();
        b.getId();
    }
}

class Human{
    private int age;
    String name;
    protected int id;

    void getAge(){
        System.out.println(age);
    }
}

class Boy extends Human{
    void sayAge(){
        // age 在 learnClass.Human 中是 private 访问控制
//        System.out.println(age);
    }

    void getId(){
        System.out.println(id);
    }
}
