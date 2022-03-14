package learnIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 使用字节缓冲流写入文件
 * BufferedOutputStream
 * */

public class TestBufferedOutputStream {
    public static void main(String[] args) throws Exception {
        // 1、创建流
        FileOutputStream fos = new FileOutputStream("d:\\buffer.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos); // 默认8k大小

        // 2、写入文件
        for(int i = 0; i < 10; i++){
            bos.write("hello world!\n".getBytes()); // 写入缓冲区
            bos.flush(); // 刷新到硬盘
        }

        // 3、关闭流（内部调用flush刷新方法）
        bos.close();
    }
}
