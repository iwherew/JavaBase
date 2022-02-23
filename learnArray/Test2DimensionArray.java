package learnArray;

/**
 * 二维数组
 * */

public class Test2DimensionArray {
    public static void main(String[] args) {
        int[][] a = new int[3][];

        a[0] = new int[]{20,30};
        a[1] = new int[]{10,15,80};
        a[2] = new int[]{50,60};

        System.out.println(a[1][2]);

        // 初始赋值
        int[][] b = {
                {20,30,50},
                {50,6,45},
                {1100,255,154}
        };
    }
}
