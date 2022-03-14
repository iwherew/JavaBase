package learnIO;

import java.io.PrintWriter;

public class TestPrintWriter {
    public static void main(String[] args) throws Exception{
        // 1、创建一个打印流
        PrintWriter pw = new PrintWriter("d:\\print.txt");
        // 2、打印
        pw.println(97);
        pw.println(true);
        pw.println(3.14);
        pw.println('a');
        // 3、关闭
        pw.close();
    }
}
