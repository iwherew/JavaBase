package learnCollection;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet 里面元素不可重复
 *
 * HashSet 底层是 HashMap, HashSet传入的是HashMap的key,所以不可重复，传入的HashMap的value为一个固定对象
 *
 * */

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("aa");
        set1.add("bb");
        set1.add("aa");
        System.out.println(set1);

        set1.remove("bb");
        System.out.println(set1);

        Set<String> set2 = new HashSet<>();
        set2.add("AA");
        set2.add("BB");
        set2.addAll(set1);

        System.out.println(set2);
    }
}
