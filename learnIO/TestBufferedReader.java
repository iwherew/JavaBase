package learnIO;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 使用字符缓冲流读取文件
 * BufferedReader
 * */

public class TestBufferedReader {
    public static void main(String[] args) throws Exception{
        // 1、创建缓冲流
        FileReader fr = new FileReader("d:\\write.txt");
        BufferedReader br = new BufferedReader(fr);

        // 2、读取
        // 2.1 第一种方式
//        char[] buf = new char[1024];
//        int count = 0;
//        while((count = br.read(buf)) != -1){
//            System.out.print(new String(buf, 0 , count));
//        }
        // 2.2 第二种方式
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }


        // 3、关闭
        br.close();
    }
}
