package learnCollection;

import java.util.HashMap;

public class MyHashSet<E> {
    HashMap<E, Object> map;

    private static final Object PRESENT = new Object();

    public MyHashSet(){
        map = new HashMap<>();
    }

    public void add(E e){
        map.put(e,PRESENT);
    }
}
