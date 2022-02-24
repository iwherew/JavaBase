package learnString;

/**
 * 可变字符序列
 * StringBuilder：线程不安全，效率高（一般使用它）
 * StringBuffer：线程安全，效率低
 *
 * */

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 26; i++){
            sb.append((char)('a'+i)); // 在末尾添加
        }
        System.out.println(sb);

        sb.reverse(); // 反转
        System.out.println(sb);

        sb.setCharAt(3,'好'); // 设置某位置字符
        System.out.println(sb);

        sb.insert(1,"你").insert(6,"吗"); // 插入字符，链式调用
        System.out.println(sb);

        sb.delete(20,23); // 删除一个区间
        System.out.println(sb);
    }
}
