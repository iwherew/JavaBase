package learnIO;

import java.io.FileWriter;

/**
 * 使用FileWriter写入文件
 * */

public class TestFileWriter {
    public static void main(String[] args) throws Exception{
        // 1、创建FileWriter对象
        FileWriter fw = new FileWriter("d:\\write.txt");
        // 2、写入
        for (int i = 0; i < 10; i++){
            fw.write("Hello World\n");
            fw.flush();
        }
        // 3、关闭
        fw.close();
    }
}
