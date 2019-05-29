package wtyDemo;

public class Day1029 {
    public static void main(String[] args) {
        /**
         * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
         * 小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，
         * 问每个月的兔子总数为多少？
         */

        for (int i = 1; i < 10; i++) {
            System.out.println(i + "==============" + sum(i));
        }
    }


    public static int sum(int month) {

        for (int i = 1; i <= month; i++) {
            if (i == 1) {
                return 2;
            } else if (i == 2) {
                return 2;
            } else {
                return 2+sum(i--);
            }


        }


        return -1;
    }

    ;

}
