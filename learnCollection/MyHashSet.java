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

    public int size(){
        return map.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Object key: map.keySet()){
            sb.append(key + ",");
        }
        if(sb.toString().equals("[")){
            sb.append("]");
        }else{
            sb.setCharAt(sb.length()-1,']');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MyHashSet<String> mh = new MyHashSet<>();
        mh.add("aaa");
        mh.add("bbb");
        mh.add("ccc");
        System.out.println(mh.size());
        System.out.println(mh);
    }
}
