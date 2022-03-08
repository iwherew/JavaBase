package learnIO;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用FileReader和FileWriter复制文本文件，不能复制图片或二进制文件
 * */

public class TestCopyTxtFile {
    public static void main(String[] args) throws Exception{
        // 1、创建 FileReader FileWriter
        FileReader fr = new FileReader("d:\\write.txt");
        FileWriter fw = new FileWriter("d:\\writer2.txt");

        // 2、读写
        int data = 0;
        while((data = fr.read()) != -1){
            fw.write(data);
            fw.flush();
        }

        // 3、关闭
        fr.close();
        fw.close();
    }
}
