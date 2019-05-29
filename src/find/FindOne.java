package find;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class FindOne {
    public static void main(String[] args) {
        int arr[] = {22, 31, 44, 22, 5, 7, 3, 9, 55, 324, 123, 1, 56565, 555, 56, 253, 76, 5, 12, 7, 235, 11};
        int i = 5;
        String result1 = shunxu(arr, i);
        System.out.println("顺序查找法： "+result1);
        String result2 = zheban(arr, i);
        System.out.println("折半查找法： "+result2);


    }

    /**
     * 折半查找法
     * @param arr
     * @param i
     * @return
     */
    private static String zheban(int[] arr, int i) {
        Arrays.sort(arr);
        String result="";
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;
        while (low <= high) {
            middle = low + (high - low) / 2;//避免溢出
            if (arr[middle] == i)
                return result;
            else if (arr[middle] > i)
                high = middle - 1;
            else
                low = middle + 1;
        }
        return result;

    }

    /**
     * 顺序查找
     *
     * @param arr
     * @param i
     * @return
     */
    private static String shunxu(int[] arr, int i) {
        String s = "";
        for (int j = 0; j < arr.length; j++) {
            if (i == arr[j]) {
                s = s + j + "  ";
            }
        }
        return s;

    }


}
