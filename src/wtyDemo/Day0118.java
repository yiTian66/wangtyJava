package wtyDemo;

public class Day0118 {


    public static void main(String[] args) {
        //递归求5的阶乘
        int s = diGui(5);
        System.out.println(s);
        //写个冒泡排序的例子
        int a[] = {1, 23, 33, 3, 3, 54, 7, 99, 666, 45};
        int b[] = maoPao(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    /**
     * 冒泡排序
     *
     * @param arr
     * @return
     */
    private static int[] maoPao(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int diGui(int i) {
        if (i == 1) {
            return 1;
        } else {

            return i * diGui(--i);
        }

    }

}
