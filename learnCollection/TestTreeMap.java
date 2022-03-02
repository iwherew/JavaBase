package learnCollection;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap有顺序
 * */

public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> treeMap1 = new TreeMap<>();

        treeMap1.put(20,"aa");
        treeMap1.put(3,"bb");
        treeMap1.put(6,"cc");

        // 按照key递增的方式排序
        for(Integer key: treeMap1.keySet()){
            System.out.println(key + " : " + treeMap1.get(key));
        }

        Map<Emp,String> treeMap2 = new TreeMap<>();
        treeMap2.put(new Emp(10,"张三",5000),"good");
        treeMap2.put(new Emp(5,"李四",2000),"well");
        treeMap2.put(new Emp(7,"王五",10),"so");

        for(Emp key: treeMap2.keySet()){
            System.out.println(key + " : " + treeMap2.get(key));
        }
    }
}

// 实现 Comparable 接口中的 compareTo, 使得 keySet() 能自定义排序
class Emp implements Comparable<Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp o) {   // 负数-小于 0-等于 正数-大于
        if(this.salary > o.salary){
            return 1;
        }else if(this.salary < o.salary){
            return -1;
        }else{
            if(this.id > o.id){
                return 1;
            }else if(this.id < o.id){
                return -1;
            }else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "id:" + id + " name: " + name + " salary:" + salary;
    }
}
