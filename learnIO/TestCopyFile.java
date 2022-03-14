package learnIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用文件字节流实现文件的复制
 * */

public class TestCopyFile {
    public static void main(String[] args) throws Exception {
        // 1、创建流
        // 1.1 文件字节输入流
        FileInputStream fis = new FileInputStream("d:\\aaa.txt");
        // 1.2 文件字节输出流
        FileOutputStream fos = new FileOutputStream("d:\\ccc.txt");

        // 2、实现复制，一边读，一边写
        byte[] buf = new byte[1024];
        int count = 0;
        while((count = fis.read(buf)) != -1){
            fos.write(buf,0,count);
        }
        //3、关闭
        fis.close();
        fos.close();
        System.out.println("复制完毕");
    }
}
