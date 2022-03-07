package learnCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections辅助类的使用
 * */

public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i =0;i<10;i++){
            list.add("list" + i);
        }
        System.out.println(list);


        Collections.reverse(list); // 逆序
        System.out.println(list);

        Collections.shuffle(list); // 随机排列list中的元素
        System.out.println(list);

        Collections.sort(list); // 递增排序
        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"3")); // 二分法查询，查不到返回负数
        System.out.println(Collections.binarySearch(list,"list3"));
    }
}
