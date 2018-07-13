package wtyDemo;


import jdk.nashorn.internal.runtime.regexp.joni.ast.Node;
import sun.plugin.javascript.navig.Link;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Day0614 {
    public static void main(String[] args) {

//        Set<Integer> s = new HashSet<Integer>();
//        boolean add = s.add(1);
//        System.out.println(add);
//        int result1 = hanoi(1, 'a', 'b', 'c');
//        System.out.println(result1);
//        int result2 = hanoi(2, 'a', 'b', 'c');
//        System.out.println(result2);
//        int result3 = hanoi(3, 'a', 'b', 'c');
//        System.out.println(result3);
//        int result4 = hanoi(10, 'a', 'b', 'c');
//        System.out.println(result4);
        System.out.println("=====================================");
        int[] shuzu = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            shuzu[i] = r.nextInt(10);
            System.out.print(shuzu[i]);
        }
        System.out.println("");
//        sort(shuzu);
        // maopao(shuzu);

        // quick_sort(shuzu, 0, shuzu.length - 1);
//        for (int i = 0; i < 10; i++) {
//            System.out.print(shuzu[i]);
//        }


        charu(shuzu);
        //快速排序性时间复杂度最小，稳定性略差
    }


    /**
     * 圆盘
     *
     * @param n
     * @param A
     * @param B
     * @param C
     * @return
     */
    public static int hanoi(int n, char A, char B, char C) {
        if (n == 1) {
            //只有一个圆盘需要移动时
            int count = move(A, C);
            return count;
        }
        //先把a上的n-1个圆盘移到b上
        int count1 = hanoi(n - 1, A, C, B);
        //把A上最后一个圆盘移动到C上
        int count2 = move(A, C);
        //把b上的n-1个圆盘移到c上
        int count3 = hanoi(n - 1, B, A, C);
        return count1 + count2 + count3;
    }

    private static int move(char a, char c) {

        return 1;
    }


    /**
     * 木桶排序
     *
     * @param scores
     */
    public static void sort(int[] scores) {

        //创建一个范围数组;因为分数是0-10，所以数组长度10;
        int[] buckts = new int[10];
        //把分数放入数组对应下标
        for (int i = 0; i < scores.length; i++) {
            buckts[scores[i]] = scores[i];
        }

        for (int i = 0; i < buckts.length; i++) {
            System.out.print(buckts[i]);
        }


    }


    /**
     * 冒泡排序
     *
     * @param numbers
     */
    public static void maopao(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }


    /*
     * 快速排序
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     l -- 数组的左边界(例如，从起始位置开始排序，则l=0)
     *     r -- 数组的右边界(例如，排序截至到数组末尾，则r=a.length-1)
     */
    public static void quick_sort(int a[], int begin, int end) {
        if (begin < end) {
            int i, j, key;
            i = begin;
            j = end;
            key = a[begin];
            while (i < j) {
                while (i < j && a[j] > key) {
                    j--;
                }// 从右向左找第一个小于x的数
                if (i < j) {
                    a[i] = a[j];
                    i++;
                }
                while (i < j && a[i] < key) {
                    i++;
                }// 从左向右找第一个大于x的数
                if (i < j) {
                    a[j] = a[i];
                    j--;
                }
            }
            a[i] = key;
            quick_sort(a, begin, i - 1); /* 递归调用 */
            quick_sort(a, i + 1, end); /* 递归调用 */
        }
    }


    /**
     * 插入排序
     *
     * @param a
     */
    public static void charu(int[] a) {

        int temp, j;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i - 1;
            //将tmpNum从已是有序的序列后端开始比较
            //如果tmpNum小于后端数，那后端的数要顺移
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j--];
            }
            //将tmpNum插入到指定位置
            a[j + 1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

}

