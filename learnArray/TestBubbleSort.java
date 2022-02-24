package learnArray;

import java.util.Arrays;

/**
 * 冒泡排序
 * */

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] value = {3,1,6,4,5,8,7,9,2};

        for(int i = 0; i < value.length; i++){
            for(int j = i+1; j < value.length; j++){
                if(value[i] > value[j]){
                    int temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(value));
    }
}
