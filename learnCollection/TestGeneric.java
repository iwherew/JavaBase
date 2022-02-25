package learnCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 泛型
 * 一般用 T,E,V 代表泛型
 * */

public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<>();
        // 完整写法
//        MyCollection<String> mc = new MyCollection<String>();
        mc.set("Amadeus",0);
        String b = mc.get(0);

        List<String> list = new ArrayList<>();
        Map map = new HashMap();
    }
}

class MyCollection<E>{
    Object[] objs = new Object[5];

    public void set(E element, int index){
        objs[index] = element;
    }

    public E get(int index){
        return (E)objs[index];
    }
}
