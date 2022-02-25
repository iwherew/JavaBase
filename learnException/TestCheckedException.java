package learnException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *  使用try-catch处理异常
 * */

public class TestCheckedException {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("d:/a.txt");
            System.out.println("step1");
            char c1 = (char)reader.read();
            System.out.println(c1);
        }catch (FileNotFoundException e){ // 子类异常在父类异常前面
            e.printStackTrace();
            System.out.println("step2");
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){ // 一般使用 Exception 处理所有可检查异常
            e.printStackTrace();
        }finally {
            System.out.println("step3");
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
