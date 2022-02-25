package learnCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口中的方法
 * */

public class TestList {
    public static void main(String[] args) {
        testListSortMethods();
    }

    public static void testCollectionMethods(){
        Collection<String> c = new ArrayList<>();

        System.out.println(c.size()); // 返回元素个数
        System.out.println(c.isEmpty()); // 判断是否为空

        c.add("Amadeus"); // 添加元素
        c.add("zzz");
        System.out.println(c);
        System.out.println(c.size());

        System.out.println(c.contains("Amadeus")); // 集合是否包含某元素

        Object[] objs = c.toArray(); // 转化为Object数组
        System.out.println(objs);

        c.remove("zzz"); // 移除元素，移除对象的内存还在，只是删除集合内的引用地址
        System.out.println(c);

        c.clear(); // 清空集合
        System.out.println(c);
    }

    public static void testListMethods(){
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");

        System.out.println("list01: " + list01);

//        list01.addAll(list02); // 将集合2的元素加到集合1中
//        list01.removeAll(list02); // 去除集合1中相同元素
//        list01.retainAll(list02); // 交集
        System.out.println(list01.containsAll(list02)); // 集合2元素是否全在集合1中

        System.out.println("list01: " + list01);
    }

    // list索引和顺序方法
    public static void testListSortMethods(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        list.add(2,"Amadeus");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2,"where");
        System.out.println(list);

        System.out.println(list.get(2));

        list.add("B");
        System.out.println(list.indexOf("B")); // 返回元素第一次出现的索引，找不到返回 -1
        System.out.println(list.lastIndexOf("B")); // 返回元素最后一次出现的索引，找不到返回 -1
    }
}
