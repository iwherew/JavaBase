package learnArray;

public class TestArray {
    public static void main(String[] args) {
        // 以下两种方式都能声明数组
        int[] arr1 = new int[10]; // 推荐用法
        String arr2[] = new String[5];

        String[] s1 = {"a","b","c","d","e"};

        User[] arr3 = new User[3];

        arr1[0] = 5;
        arr1[1] = 19;
        arr1[2] = 8;

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("------------");

        // forEach循环：读取数值的值，不能修改元素的值
        for(int item: arr1){
            System.out.println(item);
        }

    }

    class User{
        private int id;
        private String name;

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
    }
}
