package learnCollection;

/**
 * 自定义实现ArrayList
 * */

public class MyArrayList<E> {
    private Object[] elementData;
    private int size;

    // 默认初始长度
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity){
        if(capacity < 0){
            throw new RuntimeException("容器的容量不能为负数");
        }else if(capacity == 0){
            elementData = new Object[DEFAULT_CAPACITY];
        }else{
            elementData = new Object[capacity];
        }
    }

    public void add(E element){
        // 什么时候扩容
        if(size == elementData.length){
            // 怎么扩容
            Object[] newArray = new Object[elementData.length+(elementData.length>>1)]; // 原长度 + 右移一位长度
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
        elementData[size++] = element;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < size; i++){
            sb.append(elementData[i]);
            if(i != size -1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public E get(int index){
        checkRange(index);
        return (E)elementData[index];
    }

    public void set(int index, E element){
        checkRange(index);
        elementData[index] = element;
    }

    public void checkRange(int index){
        // 索引合法判断 [0,size)
        if(index < 0 || index > size-1){
            // 不合法
            throw new RuntimeException("索引不合法:" + index);
        }
    }

    public void remove(E element){
        // 将element和所有元素比较，获得第一个比较为true的，返回
        for(int i = 0; i < size; i++){
            if(elementData[i].equals(element)){
                // 将该元素从此处移除
                remove(i);
            }
        }
    }

    public void remove(int index){
        System.arraycopy(elementData, index+1, elementData,index,size - index -1);
        elementData[size--] = null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args) {
        MyArrayList<String> ma = new MyArrayList<>(5);
        ma.add("aa");
        ma.add("bb");
        ma.add("cc");
        ma.add("dd");
        ma.add("ee");
        ma.add("ff");
        System.out.println(ma);
        System.out.println(ma.get(2));
        ma.set(3,"Amadeus");
        System.out.println(ma);
        ma.remove("Amadeus");
        System.out.println(ma);
        System.out.println(ma.size);
//        ma.get(10);
//        ma.set(7,"where");
    }

}
