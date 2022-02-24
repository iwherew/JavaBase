package learnClass;

/**
 * 自动装箱、自动拆箱
 * */

public class TestAutoBox {
    public static void main(String[] args) {
        // 自动装箱，数字转为包装类
        Integer a = 123; // 编译器自动转义为： Integer a = Integer.valueOf(123);

        // 自动拆箱，包装类转为数字
        int b = a; // 编译器自动转义为：int b = a.intValue();

        Integer c = null;
//        int d = c; // NullPointerException，调用c.intValue()
        if(c != null){
            int d = c;
        }

        // 缓存[-128,127]之间的数字
        // 包装类启动时，会把[-128,127]的Integer对象生成到cache[]缓存数组中
        // 调用valueOf()时，检查数字是否在[-128,127]之间，
        // 如果在缓存范围里，则会返回缓存对象
        // 如果不在缓存范围里，则创建新的Integer对象
        Integer in1 = 123;
        Integer in2 = 123;
        System.out.println(in1 == in2); // true,因为123在缓存范围内
        System.out.println(in1.equals(in2));// true
        System.out.println("------------");
        Integer in3 = 1234;
        Integer in4 = 1234;
        System.out.println(in3 == in4); // false,因为1234不在缓存范围内
        System.out.println(in3.equals(in4));// true
    }
}
