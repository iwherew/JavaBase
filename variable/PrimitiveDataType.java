package variable;

/**
 *  基本数据类型
 *  三大类，八小类
 *  数值型，字符型（char）[2 byte]，布尔型（boolean）[1 bit]
 *  整数类型： byte[1 byte]、 short[2 byte]、 int[4 byte]、 long[8 byte]
 *  浮点类型： float[4 byte]、 double[8 byte]
 *
 *  引用数据类型 [4 byte] 存地址
 *  类（class）、接口（interface）、数组
 *
 * */

import java.math.BigDecimal;

/**
 *  十进制： 10、15、-500
 *  八进制： 0开头，015
 *  十六进制： 0x 或 0X 开头， 0x15
 *  二进制： 0b 或 0B 开头， 0b11011001
 * */

public class PrimitiveDataType {
    public static void main(String[] args) {
        // 整型变量
        int a = 15;
        int b = 015; // 0开头是八进制,13
        int c = 0x15; // 0x开头十六进制，21
        int d = 0b1101; // 0b开头二进制，13
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        byte age = 30;
        short salary = 30000;
        int population = 2000000000; // 整型常量默认是int类型
        long globalPopulation = 7400000000L; // 所以int类型超出的数字常量要加L，表示这是long类型的常量

        // 浮点型
        float f0 = 3.14F; // 浮点常量默认是double, 所以右侧常量要加F表示浮点常量
        double d0 = 3.14;

        // 浮点数是不精确的，不能用于比较！
        float f1 = 0.1f;
        double d1 = 1.0/10;
        System.out.println(f1 == d1); // false

        float f2 = 423432423F;
        float f3 = f2 + 1;
        System.out.println(f2 == f3); // true

        // 如果要实现运算
        // BigInteger 任意精度整数运算
        // BigDecimal 任意精度浮点运算

        BigDecimal bd = BigDecimal.valueOf(0.1);
        bd = bd.add(BigDecimal.valueOf(0.2));
        System.out.println(bd); // 0.3
        System.out.println(0.1 + 0.2); // 0.30000000000000004

        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = BigDecimal.valueOf(1.0 / 10);
        System.out.println(bd2.equals(bd3)); // true

        // 字符类型
        // 单引号表示
        char c1 = 'W';
        char c2 = '王';
        char c3 = '\u0061'; // a
        System.out.println(c3);

        System.out.println('a' + 'b'); // 195
        System.out.println("" + 'a' + 'b'); // ab

        // String 就是 字符序列（字符数组）
        String s1 = "abc";

        // 布尔类型
        boolean man = true;

        if(man){
            System.out.println("男性");
        }else {
            System.out.println("女性");
        }
    }
}
