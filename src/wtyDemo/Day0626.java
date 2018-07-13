package wtyDemo;

public class Day0626 {
    public static void main(String[] args) {

        int nums[]={1,3,5};
        int target=4;
        int i = searchInsert(nums, target);
        System.out.println(i);

    }

    /**
     * 给定一个排序数组和一个目标值，
     * 在数组中找到目标值，并返回其索引。
     * 如果目标值不存在于数组中，返回它将会被
     * 按顺序插入的位置。你可以假设数组中无重复元素。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {

        int max = nums[nums.length - 1];
        int min = nums[0];
        if (target > max) {
            return nums.length;
        } else if (target < min) {
            return 0;
        } else {
            for (int i = 0; i < nums.length ; i++) {
                if (target==nums[i] ) {
                    return i ;
                }
            }

            for (int i = 0; i <nums.length ; i++) {
                if (target>nums[i]&&target<nums[i+1]){
                    return i+1;
                }
            }

        }
        return 0;

    }


    /**
     * 给定一个字符串 (s) 和一个字符模式 (p)。实现支持 '.' 和 '*' 的正则表达式匹配。
     * '.' 匹配任意单个字符。'*' 匹配零个或多个前面的元素。匹配应该覆盖整个字符串 (s) ，
     * 而不是部分字符串。
     * 说明:
     * s 可能为空，且只包含从 a-z 的小写字母。
     * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {



        return false;
    }






}
