package learnIO;

import java.io.FileReader;

/**
 * 使用FileReader读取文件
 * */

public class TestFileReader {
    public static void main(String[] args) throws Exception{
        // 1、创建 FileReader 文件字符输入流
        FileReader fr = new FileReader("d:\\hello.txt");

        // 2、读取
        // 2.1 单个字符读取
//        int data = 0;
//        while((data = fr.read()) != -1){
//            System.out.print((char)data);
//        }
        // 2.2 多个字符读取
        char[] buf = new char[1024];
        int count = 0;
        while((count = fr.read(buf)) != -1){
            System.out.print(new String(buf, 0, count));
        }

        // 3、关闭
        fr.close();
    }
}
