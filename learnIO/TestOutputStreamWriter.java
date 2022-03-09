package learnIO;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 使用 OutputStreamWriter 写入文件，使用指定的编码
 * */

public class TestOutputStreamWriter {
    public static void main(String[] args) throws Exception{
        // 1、创建 OutputStreamWriter
        FileOutputStream fos = new FileOutputStream("d:\\info.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");

        // 2、写入
        for(int i = 0; i<10;i++){
            osw.write("hi\r\n");
            osw.flush();
        }

        // 3、关闭
        osw.close();
    }
}
