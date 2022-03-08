package learnIO;

import java.io.Serializable;

/**
 * 标记接口 Serializable 表示可序列化
 * */

public class Student implements Serializable {

    /**
     * serialVersionUID : 序列化版本号ID
     * */
    private static final long serialVersionUID = 100L;
    private String name;
    private transient int age;
    public static String country = "China";

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
