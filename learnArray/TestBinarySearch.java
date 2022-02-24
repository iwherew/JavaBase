package learnArray;

import java.util.Arrays;

/**
 * 二分法查找（折半检索）
 * 查找的数据必须是排序好的
 * */

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,8,1,2,9,5,3,7};
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, 6));
    }

    public static int binarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = (low + high)/2;
            if(value == arr[mid]){
                return mid;
            }
            if (value > arr[mid]) {
                low = mid + 1;
            }
            if(value < arr[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }
}
