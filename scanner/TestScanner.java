package scanner;

import java.util.Scanner;

/**
 * 获得键盘输入
 * */

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        System.out.println(name + ":" + age);
    }
}
