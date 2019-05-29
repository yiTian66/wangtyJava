package wtyDemo;


import java.util.Scanner;

public class Day0411 {
//    public static int cishu = 1;
//
//    public static void main(String[] args) {
//        /**
//         * 功能:自然数求和.(1,2,3,4,...,100)
//         要求:
//         1.可以输入要计算的数字,(从1开始到第几个求和)
//         2.每三个连续数字(或每三个上轮求和的结果)为一组求和,进行N轮
//         3.最终求出一个最终的和值
//         4.每轮剩余两个数字也求和,剩余一个数字轮空到下轮
//         5.输出每轮各组数字求和结果
//         提示:倒三角
//         */
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入要求和的数字：");
//        int end = sc.nextInt();
//        if (end > 100 || end < 1) {
//            System.out.println("请输入1-100之间的整数");
//            end = sc.nextInt();
//        }
//        int sum[] = new int[end];
//        for (int i = 0; i < end; i++) {
//            sum[i] = i + 1;
//            System.out.print(sum[i]+" ");
//        }
//        System.out.println("");
//        qiuHe(sum);
//    }
//
//    private static void qiuHe(int[] sum) {
//        if (sum.length == 1) {
//            return;
//        }
//        int temp = 0;
//        int j = 0;
//        for (int i = 0; i < sum.length; i++) {
//            temp = temp + sum[i];
//            if (((i + 1) % 3 == 0) || (sum.length == (i + 1) && (i + 1) % 3 == 2)) {
//                //System.out.println(temp);
//                sum[j] = temp;
//                j++;
//                temp = 0;
//            } else if (sum.length == (i + 1) && (i + 1) % 3 == 1) {
//                sum[j] = sum[i];
//                j++;
//                temp = 0;
//            }
//        }
//        int ss[] = new int[j];
//        System.arraycopy(sum, 0, ss, 0, j);
//        System.out.println("第" + cishu + "轮求和后为：");
//        for (int i = 0; i < ss.length; i++) {
//            System.out.print(ss[i] + "  ");
//        }
//        System.out.println("");
//        cishu++;
//        qiuHe(ss);
//    }



        public static void main(String[] args)
        {
            int i=1;
            for(System.out.println("a");i<3;System.out.println("b"));
            {
                System.out.println("c");
                i++;
            }
        }






}
