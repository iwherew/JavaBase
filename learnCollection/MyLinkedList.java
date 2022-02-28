package learnCollection;

/**
 *  自定义链表
 * */

public class MyLinkedList<E> {
    private Node first;
    private Node last;
    private int size;

    public Node getNode(int index){
        Node tempNode;
        if(index <= (size >> 1)){
            tempNode = first;
            for(int i = 0; i< index; i++){
                tempNode = tempNode.next;
            }
        }else{
            tempNode = last;
            for(int i = size-1; i>index; i--){
                tempNode = tempNode.previous;
            }
        }
        return tempNode;
    }

    public void checkRange(int index){
        if(index < 0 || index > size-1){
            throw new RuntimeException("索引数字不合法");
        }
    }

    public E get(int index){
        checkRange(index);
        Node tempNode = getNode(index);
        return (E)tempNode.element;
    }

    public void add(E obj){
        if(first == null){
            Node newNode = new Node(obj);
            first = newNode;
            last = newNode;
        }else{
            Node newNode = new Node(last,null,obj);
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void remove(int index){
        checkRange(index);
        Node tempNode = getNode(index);

        if(tempNode.previous != null){
            tempNode.previous.next = tempNode.next;
        }else{
            first = tempNode.next;
        }

        if(tempNode.next != null){
            tempNode.next.previous = tempNode.previous;
        }else{
            last = tempNode.previous;
        }
        size--;
    }

    public void add(int index, E obj){
        if(index < 0 || index > size){
            throw new RuntimeException("索引数字不合法");
        }
        Node newNode = new Node(obj);
        Node tempNode = getNode(index);

        if(index == size){
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
            size++;
            return;
        }

        if(tempNode != null){
            if(tempNode.previous != null){
                tempNode.previous.next = newNode;
            }else{
                first = newNode;
            }
            newNode.next = tempNode;
            newNode.previous = tempNode.previous;
            tempNode.previous = newNode;
        }
        size++;

    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        // 遍历链表
        Node tempNode = first;
        while(tempNode != null){
            sb.append(tempNode.element);
            if(tempNode != last){
                sb.append(",");
            }
            tempNode = tempNode.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyLinkedList<String> ml = new MyLinkedList<>();
        ml.add("a");
        ml.add("b");
        ml.add("c");
        ml.add("d");
        ml.add("e");

        System.out.println(ml);
        System.out.println(ml.get(3));
        ml.remove(0);
        System.out.println(ml);
        ml.remove(3);
        System.out.println(ml);
        ml.remove(1);
        System.out.println(ml);
        ml.add(2,"r");
        System.out.println(ml);
    }
}
