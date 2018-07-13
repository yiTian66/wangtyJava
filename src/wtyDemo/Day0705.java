package wtyDemo;

import java.util.Arrays;

public class Day0705 {
    public static void main(String[] args) {
        int a=12345678;

//        String s=a+"";
//        int [] sa=new int[s.length()];
//        for (int i = 0; i <s.length() ; i++) {
//            sa[i]=Integer.parseInt(s.charAt(i)+"");
//        }
//        for (int i = sa.length-1; i >=0 ; i--) {
//            System.out.print(sa[i]);
//        }

        int [] arr={2,4,3,6,7,8,5,1,9};
        int aa = aa(arr, 3);
        System.out.println(aa);
        result(a);



   }

    public static void  result(int a){
        System.out.print(a%10);
        if ((a/10)!=0){
            result(a/10);
        }
        ;
    }


    /**
     * 一个数组长度是N,求其第K个最大数，k《n
     * @param arr
     * @param b
     * @return
     */
    public static int  aa(int [] arr,int b){
        Arrays.sort(arr);
        return arr[arr.length-b];
    }

}
