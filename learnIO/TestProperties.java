package learnIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Set;

/**
 * Properties 集合
 * */

public class TestProperties {
    public static void main(String[] args) throws Exception{
        // 1、创建集合
        Properties properties = new Properties();

        // 2、添加数据
        properties.setProperty("username","zhangsan");
        properties.setProperty("age","20");

        // 3、遍历
        // 3.1 keySet
        // 3.2 entrySet
        // 3.1 stringPropertyNames()
        Set<String> proNames = properties.stringPropertyNames();
        for(String key : proNames){
            System.out.println(key +":"+properties.getProperty(key));
        }

        // 4、和流有关的方法
        // list方法 列表
//        PrintWriter pw = new PrintWriter("d:\\print.txt");
//        properties.list(pw);
//        pw.close();

        // store方法 保存
//        FileOutputStream fos = new FileOutputStream("d:\\store.properties");
//        properties.store(fos,"注释");
//        fos.close();

        // load方法 加载
        Properties properties2 = new Properties();
        FileInputStream fis = new FileInputStream("d:\\store.properties");
        properties2.load(fis);
        fis.close();
        System.out.println(properties2.toString());

    }
}
