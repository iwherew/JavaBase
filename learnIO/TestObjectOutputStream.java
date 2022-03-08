package learnIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 使用 ObjectOutputStream 实现对象序列化
 * 注意事项：
 * (1)序列化对象必须实现 Serializable 接口（接口方法为空）
 * (2)序列化类中的对象属性也要求实现 Serializable 接口
 * (3)序列化版本号ID(serialVersionUID)，保证序列化的类和反序列化的类是同一个类
 * (4)使用 transient（瞬间的） 修饰属性，这个属性就不能序列化
 * (5)静态属性也不能序列化
 * (6)序列化多个对象，可以借助集合实现
 * */

public class TestObjectOutputStream {
    public static void main(String[] args) throws Exception{
        // 1、创建对象流
        FileOutputStream fos = new FileOutputStream("d:\\stu.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 2、序列化（写入操作）
        Student stu1 = new Student("张三",20);
        Student stu2 = new Student("李四",22);
        // 单个写入
//        oos.writeObject(stu1);
//        oos.writeObject(stu2);
        // List写入
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        oos.writeObject(list);

        oos.flush();

        // 3、关闭
        oos.close();
    }

}
