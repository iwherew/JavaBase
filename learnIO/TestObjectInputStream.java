package learnIO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 使用 ObjectInputStream 实现反序列化（读取重构成对象）
 * */

public class TestObjectInputStream {
    public static void main(String[] args) throws Exception{
        // 1、创建对象流
        FileInputStream fis = new FileInputStream("d:\\stu.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 2、读取文件（反序列化）
//        Student s = (Student) ois.readObject();
        // 如果只存一个对象，不能读两次，抛出 EOFException
//        Student s2 = (Student) ois.readObject();

        // 读取List
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        // 3、关闭
        ois.close();

//        System.out.println(s);
//        System.out.println(s2);
        System.out.println(list.toString());
    }
}
