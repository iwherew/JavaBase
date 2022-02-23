package learnArray;

import java.util.Arrays;

public class TestArraysMethods {
    public static void main(String[] args) {
        int[] a = {10,20,50,30};

        System.out.println(a);

        System.out.println(Arrays.toString(a)); // 打印字符串
        System.out.println(a.toString()); // 打印地址，注意区别

        Arrays.sort(a); // 排序,改变原数组
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a, 30)); // 二分法查找指定元素
        System.out.println(Arrays.binarySearch(a, 77)); // 没找到返回负数

    }
}
