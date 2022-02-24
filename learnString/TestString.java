package learnString;

public class TestString {
    public static void main(String[] args) {
        // 不可变字符序列
        // 有 final 修饰，初始化后不能改变值
        // private final char value[];
        String str = "abc";
        String str2 = new String("abc");
        String str3 = "ab" + "cd";
        String str4 = "18" + 19;
        System.out.println(str4);

        System.out.println("-------------------");
        String str10 = "Amadeus"; // 常量池
        String str11 = "Amadeus"; // 常量池
        String str12 = new String("Amadeus"); // 创建一个新对象
        String str13 = new String("Amadeus"); // 创建一个新对象

        System.out.println(str10 == str11);
        System.out.println(str10 == str12);
        System.out.println(str12 == str13);

        // 通常比较字符串时，使用 equals
        System.out.println(str10.equals(str12));

        System.out.println("-------------------");
        // 编译器做了优化，直接在编译的时候将字符串进行拼接
        String str5 = "hello " + "world"; // 相当于 String str5 = "hello world";
        String str6 = "hello world";
        System.out.println(str5 == str6); // true
        // 编译的时候不知道变量中存储的是什么，所以没办法在编译的时候优化
        String str7 = "hello ";
        String str8 = "world";
        String str9 = str7 + str8;
        System.out.println(str9 == str6); // false

    }
}
