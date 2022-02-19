package learnClass;

/**
 * 继承
 * 类只有单继承，接口可以多继承
 * 如果定义一个类时，没有调用extends，则它的父类是 java.lang.Object
 * */

public class TestExtends {
    public static void main(String[] args) {
        MyStudent stu = new MyStudent("Amadeus", 24, 16051430);
        stu.rest();
        stu.study();

        System.out.println(stu instanceof MyStudent);
        System.out.println(stu instanceof Person);
        System.out.println(stu instanceof Object);
        System.out.println(stu.toString());
    }
}

class Person /* extend Object */{
    String name;
    int age;

    public void rest(){
        System.out.println("rest");
    }
}

class MyStudent extends Person{
    int sid;

    public MyStudent(){

    }

    public MyStudent(String name, int age, int sid){
        this.name = name;
        this.age = age;
        this.sid = sid;
    }

    // 方法重写 override
    // ==   方法名、形式参数列表相同
    // <=   返回值类型和声明异常类型，子类<=父类
    // >=   访问权限，子类>=父类
    @Override
    public void rest(){
        System.out.println("no rest");
    }

    public void study(){
        System.out.println("study");
    }

    @Override
    public String toString(){
        return "name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyStudent)) return false;
        MyStudent student = (MyStudent) o;
        return sid == student.sid;
    }
}
