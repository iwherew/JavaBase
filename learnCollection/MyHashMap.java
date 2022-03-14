package learnCollection;

public class MyHashMap<K,V> {
    HashMapNode<K,V>[] table;   // 位桶数组
    int size;   // 存放的键值对的个数

    public MyHashMap(){
        table = new HashMapNode[16]; // 长度一般定义为2的整数幂
    }

    public void put(K key, V value){
        // 定义新的节点对象
        HashMapNode<K,V> newNode = new HashMapNode<K,V>();
        newNode.hash = myHash(key.hashCode(), table.length);
        System.out.println("newNode.hash" + newNode.hash);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        HashMapNode<K,V> temp = table[newNode.hash];
        HashMapNode<K,V> iterLast = null;
        boolean keyRepeat = false;
        if(temp == null){
            table[newNode.hash] = newNode;
            size++;
        }else{
            while(temp != null){
                if(temp.key.equals(newNode.key)){
                    keyRepeat = true;
                    temp.value = newNode.value;
                    break;
                }else{
                    iterLast = temp;
                    temp = temp.next;
                }
            }
            if(!keyRepeat){
                iterLast.next = newNode;
                size++;
            }
        }
    }

    public V get(K key){
        HashMapNode<K,V> temp = table[myHash(key.hashCode(), table.length)];
        while(temp != null){
            if(temp.key.equals(key)){
                return (V) temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public int myHash(int v, int length){
        return v & (length - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        // 遍历bucket数组
        for(int i=0; i<table.length; i++){
            HashMapNode temp = table[i];
            // 遍历链表
            while(temp != null){
                sb.append(temp.key + ":" + temp.value + ",");
                temp = temp.next;
            }
        }
        if(sb.toString().equals("{")){
            sb.append("}");
        }else{
            sb.setCharAt(sb.length()-1,'}');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> m = new MyHashMap<>();
        m.put(10,"aa");
        m.put(20,"bb");
        m.put(30,"cc");
        m.put(20,"dd");
        m.put(26,"ee");
        System.out.println(m);
        System.out.println(m.get(20));
        System.out.println(m.get(26));
        System.out.println(m.get(55));
    }
}
