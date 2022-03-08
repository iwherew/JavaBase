package learnIO;

import java.io.FileOutputStream;

/**
 * 文件字节输出流使用
 * */

public class TestFileOutputStream {
    public static void main(String[] args) throws Exception{
        // 1、创建文件字节输出流对象
//        FileOutputStream fos = new FileOutputStream("d:\\bbb.txt");
        // 第二个参数是append(boolean)，为true时在文件后追加数据，为false时覆盖文件，默认为false
        FileOutputStream fos = new FileOutputStream("d:\\bbb.txt",true);

        // 2、写入文件
        // 2.1 单个字符写入
//        fos.write(97);
//        fos.write('b');
//        fos.write('c');
        // 2.2 多个字符写入
        String string = "hello world ";
        fos.write(string.getBytes());

        // 3、关闭
        fos.close();
        System.out.println("执行完毕");
    }
}
