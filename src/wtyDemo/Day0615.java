package wtyDemo;

public class Day0615 {
    public static void main(String[] args) {
        //二分查找(也叫折半查找)适用条件：1、数列有序 2、数列使用顺序存储结构(比如数组)
//        String r = reverse("abcdef");
//        System.out.println(r);
//        int[] arr = {3, -6, 1, 2, 3, -1, 2, -5, 1, 2};
//        find(arr);

        boolean b = isHappy(1);
        System.out.println(b);
    }

    /**
     * 翻转字符串
     *
     * @param s
     * @return
     */
    public static String reverse(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r = r + s.charAt(s.length() - i - 1);
        }
        return r;
    }


    public static int find(int[] nums) {
        int lastSum = 0;
        int maxSum = nums[0];
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (lastSum > 0) {
                //累加
                lastSum = lastSum + nums[i];
            } else {
                //如果需要新的起点，则重新赋值start
                lastSum = nums[i];
                start = i;
            }
            if (maxSum < lastSum) {
                //有新的最大的和了
                maxSum = lastSum;
                end = i;
            }
        }
        return maxSum;
        // System.out.println("连加值最大的和为：" + maxSum);
//        System.out.println("连加值最大的子数组为：");
//        for (int i = start; i <=end ; i++) {
//            System.out.print(nums[i]);
//            if (i!=end){
//                System.out.print(",");
//            }
//        }
//        System.out.println();
    }


    /**
     * 查询一个数是不是快乐数
     *
     * @param n
     * @return
     */
    public static boolean isHappy(int n) {

        int sum = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            sum = s.charAt(i) * s.charAt(i) + sum;
        }
        if (sum == 0) {
            return false;

        }
        if (sum == 1) {
            return true;
        } else {
            if (isHappy(sum)) {

                return true;

            }
        }

        return false;
    }


}
