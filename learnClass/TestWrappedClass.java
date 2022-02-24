package learnClass;

/**
 * 包装类
 * */

public class TestWrappedClass {
    public static void main(String[] args) {
        // 基本数据类型转成包装类对象
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(3); // 官方推荐写法

        // 把包装类对象转成基本数据类型
        int c = b.intValue();
        double d = b.doubleValue();

        // 把字符串转为包装对象
        Integer e = new Integer("999");
        Integer f = Integer.parseInt("999");

        // 把包装类转为字符串
        String str = f.toString();
        String str2 = "" + f;

        // 常见的常量
        System.out.println("int max:" + Integer.MAX_VALUE);

    }
}
