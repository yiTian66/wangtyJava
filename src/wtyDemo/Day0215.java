package wtyDemo;

import java.util.ArrayList;
import java.util.Collections;

import static wtyDemo.Day0614.maopao;

public class Day0215 {
    public static void main(String[] args) {

        //排序算法
        int [] nums={1,22,3,45,66,765,98,89,65,1,1,9,546,100};

        maopao1(nums);
        maopao2(nums);

        Collections.sort(new ArrayList<String>());



    }

    private static void maopao2(int[] nums) {
        int temp;
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i; j <nums.length ; j++) {
                if (nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }

        }
        for (int i = 0; i <nums.length ; i++) {
            System.out.println("2222222          "+nums[i]);

        }

















    }

    /**
     * 冒泡排序
     * @param nums
     */
    private static void maopao1(int[] nums) {
    int temp;
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                    if (nums[i]>nums[j]){
                        temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
            }
        }

        for (int i=0;i<nums.length;i++){
            System.out.println(i+"     "+nums[i]);
        }


    }


}
