package learnString;

public class TestStringMethods {
    public static void main(String[] args) {
        String s1 = "core Java";
        String s2 = "Core Java";

        System.out.println(s1.charAt(3)); // 提取下标为3的字符

        System.out.println(s1.length()); // 长度

        System.out.println(s1.equals(s2)); // 比较两个字符串是否相等
        System.out.println(s1.equalsIgnoreCase(s2)); // 比较两个字符串是否相等(忽略大小写)

        System.out.println(s1.indexOf("Java")); // 查询值第一次出现的位置
        System.out.println(s1.indexOf("Python")); // 没查到返回 -1

        System.out.println(s1.replace("Java","C")); // 替换，产生新字符串对象，原字符串不变

        System.out.println(s1.startsWith("core")); // 判断开头

        System.out.println(s1.substring(5)); // 截取子字符串，从下标为6开始 Java
        System.out.println(s1.substring(5,7)); // [5,7) ja

        System.out.println(s1.toLowerCase()); // 转小写
        System.out.println(s1.toUpperCase()); // 转大写

        System.out.println(s1.trim()); // 去除首尾空格，生成新字符串，不改变原字符串
    }
}
