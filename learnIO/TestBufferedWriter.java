package learnIO;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * BufferedWriter
 * */

public class TestBufferedWriter{
    public static void main(String[] args) throws Exception{
        // 1、创建BufferedWriter对象
        FileWriter fw = new FileWriter("d:\\bufferWriter.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        // 2、写入
        for(int i = 0; i < 10; i++){
            bw.write("hello");
            bw.newLine(); // 写入一个换行符
            bw.flush();
        }

        // 3、关闭
        bw.close();
    }
}
