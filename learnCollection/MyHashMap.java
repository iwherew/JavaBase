package learnCollection;

public class MyHashMap<K,V> {
    HashMapNode<K,V>[] table;   // 位桶数组
    int size;   // 存放的键值对的个数

    public MyHashMap(){
        table = new HashMapNode[16]; // 长度一般定义为2的整数幂
    }

    public void put(K key, V value){
        HashMapNode<K,V> newNode = new HashMapNode<K,V>();
    }
}
