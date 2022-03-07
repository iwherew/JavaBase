package learnCollection;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(300);
        set.add(200);
        set.add(600);

        // 按照元素递增的顺序排序
        for (Integer m: set){
            System.out.println(m);
        }

        Set<Emp2> set2 = new TreeSet<>();
        set2.add(new Emp2(10,"张三",5000));
        set2.add(new Emp2(5,"李四",2000));
        set2.add(new Emp2(7,"王五",10));

        for(Emp2 m : set2){
            System.out.println(m);
        }
    }
}


// 实现 Comparable 接口中的 compareTo, 使得 set 能自定义排序
class Emp2 implements Comparable<Emp2>{
    int id;
    String name;
    double salary;

    public Emp2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp2 o) {   // 负数-小于 0-等于 正数-大于
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
