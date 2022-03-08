package learnIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 字节缓冲流读取
 * BufferedInputStream
 * */

public class TestBufferedInputStream {
    public static void main(String[] args) throws Exception {
        // 1、创建BufferedInputStream
        FileInputStream fis = new FileInputStream("d:\\aaa.txt");
        // private static int DEFAULT_BUFFER_SIZE = 8192; 默认8k长度
        BufferedInputStream bis = new BufferedInputStream(fis);

        // 2、读取
        // 2.1 单字节读取
//        int data = 0;
//        while((data = bis.read()) != -1){
//            System.out.print((char)data);
//        }
        // 2.2 多字节读取
        byte[] buf = new byte[1024];
        int count = 0;
        while((count = bis.read(buf)) != -1){
            System.out.print(new String(buf,0,count));
        }

        // 3、关闭:只需要关闭 BufferedInputStream
        bis.close();
    }
}
