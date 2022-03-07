package learnCollection;

import java.util.*;

/**
 * 迭代器
 * */

public class TestIterator {
    public static void main(String[] args) {
        testIteratorMap2();
    }

    public static void testIteratorList(){
        List<String> list = new ArrayList<>();
        list.add("aa list");
        list.add("bb list");
        list.add("cc list");

        for (Iterator<String> iter = list.iterator(); iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }
    }

    public static void testIteratorSet(){
        Set<String> set = new HashSet<>();
        set.add("aa set");
        set.add("bb set");
        set.add("cc set");

        for (Iterator<String> iter = set.iterator(); iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }
    }

    // 不推荐
    public static void testIteratorMap(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"aa map");
        map.put(3,"bb map");
        map.put(2,"cc map");

        Set<Map.Entry<Integer, String>> ss = map.entrySet();
        for(Iterator<Map.Entry<Integer, String>> iter = ss.iterator(); iter.hasNext();){
            Map.Entry<Integer, String> temp = iter.next();
            System.out.println(temp.getKey() + ":" + temp.getValue());
        }
    }

    // 推荐
    public static void testIteratorMap2(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"aa map2");
        map.put(3,"bb map2");
        map.put(2,"cc map2");

        Set<Integer> keySet = map.keySet();
        for (Iterator<Integer> iter = keySet.iterator();iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key + ":" + map.get(key));
        }
    }
}
