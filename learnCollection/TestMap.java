package learnCollection;

import java.util.HashMap;
import java.util.Map;

/**
 * Map是接口，HashMap是实现类
 * */

public class TestMap {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001,"Amadeus",100);
        Employee e2 = new Employee(1002,"where",200);
        Employee e3 = new Employee(1003,"kk",300);

        Map<Integer, Employee> m3 = new HashMap<>();

        m3.put(1001, e1);
        m3.put(1002, e2);
        m3.put(1003, e3);

        Employee emp = m3.get(1001);
        System.out.println(emp.getName());

    }

    public void test1(){
        // <K, V>
        Map<Integer, String> m1 = new HashMap<>();

        m1.put(1,"one");
        m1.put(2,"two");
        m1.put(3,"three");

        System.out.println(m1.get(1));
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey(2));
        System.out.println(m1.containsValue("four"));

        Map<Integer, String> m2 = new HashMap<>();
        m2.put(4, "四");
        m2.put(5, "五");

        m1.putAll(m2);
        System.out.println(m1);

        // map键不能重复, 如果重复（根据equals判断是否重复），新的覆盖旧的
        m1.put(3,"三");
        System.out.println(m1);
    }
}


class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}