package learnClass;

public class Student {

    // 属性 field
    int id;
    String name;
    int age;
    Computer comp;

    // 方法
    void study(){
        System.out.println("学习, 使用电脑："+comp.brand);
    }

    void play(){
        System.out.println("玩游戏");
    }

    // 构造方法。用于创建这个类的对象。
    // 无参数的构造方法可以由系统自动创建。
    // 方法名和类名必须一样
    Student(){

    }

    // 程序执行的入口，必须要有
    public static void main(String[] args) {
        Student stu = new Student();
        stu.id = 16051430;
        stu.name = "amadeus";
        stu.age = 18;

        Computer c1 = new Computer();
        c1.brand = "dell";
        stu.comp = c1;

        stu.study();
    }
}

// 一个java文件可以有多个类，只能有一个public类
class Computer{
    String brand;
}
