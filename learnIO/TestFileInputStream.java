package learnIO;

import java.io.FileInputStream;

/**
 *  FileInputStream的使用
 *  文件字节输入流
 * */

public class TestFileInputStream {
    public static void main(String[] args) throws Exception{
        // 1、创建FileInputStream，并指定文件路径
        FileInputStream fis = new FileInputStream("d:\\aaa.txt");

        // 2、读取文件
//        fis.read();
        // 2.1 单字节读取，效率低
//        int data = 0;
//        while((data = fis.read()) != -1){
//            System.out.print((char)data);
//        }
        // 2.2 一次读取多个字节
//        byte[] buf = new byte[3];
        byte[] buf = new byte[1024];
        int count = 0;
        while((count = fis.read(buf)) != -1){
            System.out.print(new String(buf,0,count));
        }


        // 3、关闭
        fis.close();
        System.out.println();
        System.out.println("执行完毕");

    }
}
