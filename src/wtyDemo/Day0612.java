package wtyDemo;

public class Day0612 {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int b = trap(a);
        System.out.println(a.toString() + "+++++++++++++++" + b);
    }


    /**
     * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，
     * 计算按此排列的柱子，下雨之后能接多少雨水。
     *
     * @param height
     * @return
     */
    public static int trap(int[] height) {
        //如果长度小于3返回0
        if (height.length < 3) {
            return 0;
        }


        int tempIndex = -1;
        int minIndex = 0;
        int water = 0;

        if (height[0] != 0) {
            tempIndex = 0;
        }


        //找出高点
        for (int i = 1; i < height.length - 1; i++) {


            if (height[i] > height[i - 1] || height[i] > height[i + 1]) {

                if (tempIndex < 0) {
                    //第一个高点,记录高点坐标
                    tempIndex = 0;
                }
                //不是第一个，temIndex记录上一个高点坐标
                if (height[tempIndex] > height[i]) {
                    minIndex = i;
                } else {
                    minIndex = tempIndex;
                }
                int sTotal = height[minIndex] * (i - tempIndex);
                int zhuzi = 0;
                for (int j = tempIndex; j < i; j++) {
                    zhuzi += height[j];
                }
                //总水量
                water = water + (sTotal - zhuzi);

            }


        }


        //计算两个高点之间的距离，面积。减去柱子面积就是水的面积


        return water;
    }


    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) * 2 - 1;

    }


}
