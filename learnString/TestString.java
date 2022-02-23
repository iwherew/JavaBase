package learnString;

public class TestString {
    public static void main(String[] args) {
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

    }
}
