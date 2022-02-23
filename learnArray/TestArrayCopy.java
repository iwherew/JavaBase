package learnArray;

/**
 * 数组的拷贝
 * */

public class TestArrayCopy {
    public static void main(String[] args) {
        String[] s1 = {"a","b","c","d","e"};
        String[] s2 = new String[10];
        System.arraycopy(s1,2,s2,6,3);

//        for(String item : s2){
//            System.out.println(item);
//        }

//        String[] s3 = delStringIndex(s1, 1);
//        for(String item: s3){
//            System.out.println(item);
//        }
        extendRange();
    }

    // 删除字符串数组里的元素
    public static String[] delStringIndex(String[] s, int index){
        System.arraycopy(s, index+1, s,index,s.length - index - 1);
        s[s.length-1] = null;
        return s;
    }

    // 数组扩容：先定义一个更大的数组，然后将原数组原封不动拷贝到新数组
    public static void extendRange(){

    }
}
