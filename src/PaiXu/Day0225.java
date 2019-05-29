package PaiXu;

import java.util.Arrays;
import java.util.Random;


public class Day0225 {


    public static void main(String[] args) throws InterruptedException {
        //////////////////////////////////冒泡排序///////////////////////////////

        //产生一个随机数组
        int m[] = MakeArr(100);
        System.out.println(Arrays.toString(m));
        long start = System.currentTimeMillis();
        //冒泡排序
        int[] maopao = bubbleSort(m);
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序" + (end - start) + Arrays.toString(maopao));
        //////////////////////////////////选择排序///////////////////////////////

        //产生一个随机数组
        int m1[] = MakeArr(100);
        System.out.println(Arrays.toString(m1));
        long start1 = System.currentTimeMillis();
        //选择排序
        int[] kuaiSu = selectionSort(m1);
        long end1 = System.currentTimeMillis();
        System.out.println("选择排序" + (end1 - start1) + Arrays.toString(kuaiSu));
        ////////////////////////////////插入排序/////////////////////////////////

        //产生一个随机数组
        int m2[] = MakeArr(100);
        System.out.println(Arrays.toString(m2));
        long start2 = System.currentTimeMillis();
        //插入排序
        int[] charu = insertionSort(m2);
        long end2 = System.currentTimeMillis();
        System.out.println("插入排序" + (end2 - start2) + Arrays.toString(charu));
        ////////////////////////////////希尔排序/////////////////////////////////

        //产生一个随机数组
        int m3[] = MakeArr(100);
        System.out.println(Arrays.toString(m3));
        long start3 = System.currentTimeMillis();
        //希尔排序
        shellSort(m3);
        long end3 = System.currentTimeMillis();
        System.out.println("希尔排序" + (end3 - start3) + Arrays.toString(m3));

        ////////////////////////////////快速排序/////////////////////////////////

        //产生一个随机数组
        int m4[] = MakeArr(100);
        System.out.println(Arrays.toString(m4));
        long start4 = System.currentTimeMillis();
        //快速排序
        quickSort(m4, 0, m4.length - 1);
        long end4 = System.currentTimeMillis();
        System.out.println("快速排序" + (end4 - start4) + Arrays.toString(m4));

    }

    /**
     * 快速排序
     *
     * @param a
     * @param low
     * @param high
     */
    public static void quickSort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];
        while (end > start) {
            //从后往前比较
            while (end > start && a[end] >= key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while (end > start && a[start] <= key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if (start > low) quickSort(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        if (end < high) quickSort(a, end + 1, high);//右边序列。从关键值索引+1到最后一个
    }


    /**
     * 希尔排序
     * 有错误，排序不正确
     *
     * @param m3
     * @return
     */
    private static void shellSort(int[] m3) {
        if (m3 == null || m3.length <= 1) {
            return;
        }
        //增量
        int incrementNum = m3.length / 2;
        while (incrementNum >= 1) {
            for (int i = 0; i < m3.length; i++) {
                //进行插入排序
                for (int j = i; j < m3.length - incrementNum; j = j + incrementNum) {
                    if (m3[j] > m3[j + incrementNum]) {
                        int temple = m3[j];
                        m3[j] = m3[j + incrementNum];
                        m3[j + incrementNum] = temple;
                    }
                }
            }
            //设置新的增量
            incrementNum = incrementNum / 2;
        }
    }

    /**
     * 插入排序
     *
     * @param m2
     * @return
     */
    private static int[] insertionSort(int[] m2) {
        int preIndex, current;
        for (int i = 1; i < m2.length; i++) {
            preIndex = i - 1;
            current = m2[i];
            while (preIndex >= 0 && m2[preIndex] > current) {
                m2[preIndex + 1] = m2[preIndex];
                preIndex--;
            }
            m2[preIndex + 1] = current;
        }
        return m2;
    }

    /**
     * 选择排序
     *
     * @param m
     * @return
     */
    private static int[] selectionSort(int[] m) {
        int minIndex = 0;
        int temp = m[0];

        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[j] < m[minIndex]) {
                    minIndex = j;
                }
            }
            temp = m[i];
            m[i] = m[minIndex];
            m[minIndex] = temp;
        }
        return m;
    }

    /**
     * 冒泡排序
     *
     * @param m
     * @return
     */
    private static int[] bubbleSort(int[] m) {

        int temp = 0;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] > m[j]) {
                    temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
        return m;
    }


    /**
     * 产生一个固定i位的随机数组
     *
     * @param i
     * @return
     */
    private static int[] MakeArr(int i) {

        int[] ints = new int[i];
        Random r = new Random();
        for (int j = 0; j < ints.length; j++) {

            ints[j] = r.nextInt(100);
        }
        return ints;

    }
}
