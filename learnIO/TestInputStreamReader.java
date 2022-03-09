package learnIO;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 使用 InputStreamReader 读取文件，指定使用的编码
 * */

public class TestInputStreamReader {
    public static void main(String[] args) throws Exception{
        // 1、创建 InputStreamReader 对象
        FileInputStream fis = new FileInputStream("d:\\write.txt");
        InputStreamReader irs = new InputStreamReader(fis, "utf-8");

        // 2、读取文件
        int data = 0;
        while((data = irs.read()) != -1){
            System.out.print((char) data);
        }

        // 3、关闭
        irs.close();

    }
}
