package wtyDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Day0604 {

    public static void main(String[] args) {
        int[] a = new int[20];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        ;
        int b = r.nextInt(100);
        int[] result = twoSum(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(b);
        System.out.println(Arrays.toString(result));
        int[] ints = twoSumBest(a, b);
        System.out.println("==================================");
        System.out.println(Arrays.toString(ints));
        int n = r.nextInt(999)+1;
        int i = minSteps(n);
        System.out.println("参数：" +n+"结果："+i);
//        int cc=r.nextInt(999999999);
//        System.out.println(cc+"============"+reverse(cc));

        int abc = reverse(-2147483648);
        System.out.println(abc);
    }

    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
     *
     * @param a
     * @param b
     * @return
     */
    private static int[] twoSum(int[] a, int b) {
            int resultA;
            int resultB;
            for (int i = 0; i < a.length-1; i++) {
                resultA = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (b == a[i] + a[j]) {
                        resultB = j;
                        return new int[]{resultA, resultB};
                    }

                }

            }

            return null;
    }


    /**
     *执行最快
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSumBest(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length < 2)
            return res;


        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
            if (min > nums[i])
                min = nums[i];
        }

        int[] index = new int[max - min+1];
        target = target ;
        int other =0;
        for (int i = 0; i < nums.length; i++) {
            // if (index[target - numbers[i] + min ] == 0) {
            // }
            other = target - nums[i];
            if(other < min || other > max) {
                continue;
            }
            if(index[other- min] > 0) {
                res[0] = index[other -min ]-1;
                res[1] = i;
                return res;
            }
            index[nums[i] - min] = i+1;
        }
        return res;
    }


    /**
     * 最初在一个记事本上只有一个字符 'A'。你每次可以对这个记事本进行两种操作：

     Copy All (复制全部) : 你可以复制这个记事本中的所有字符(部分的复制是不允许的)。
     Paste (粘贴) : 你可以粘贴你上一次复制的字符。
     给定一个数字 n 。你需要使用最少的操作次数，在记事本中打印出恰好 n 个 'A'。
     输出能够打印出 n 个 'A' 的最少操作次数。n 的取值范围是 [1, 1000] 。
     * @param n
     * @return
     */
    public static int minSteps(int n) {
        //1:0
        //2:2
        //3:3
        //4:4
        //5:5
        //6:5
        return 0;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {



        return null;
    }


    /**最后int能标识的最大/最小数字是：2的31次方：+/- 2147483648
     * 给定一个 32 位有符号整数，将整数中的数字进行反转。
     * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。
     * 根据这个假设，如果反转后的整数溢出，则返回 0。
     * @param x
     * @return
     */
    public static int  reverse(int x) {
        boolean flag=false;
        System.out.println("入参："+x);
        Long y= Long.valueOf(x);
                if (y<0){
                    y=-y;   //有问题
                 flag=true;
                    System.out.println("取相反数符后："+y);
                }

        String xString = String.valueOf(y);
                String result="";
        for (int i = xString.length()-1; i >=0 ; i--) {
                result+=xString.charAt(i);
        }
        long l = Long.parseLong(result);

        if (flag){
            l=-l;
        }
        if (l>=2147483648L||l<-2147483648L){
            return 0;
        }


        return (int)l;
    }

}
