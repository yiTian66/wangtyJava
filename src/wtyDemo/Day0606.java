package wtyDemo;

public class Day0606 {

    public static void main(String[] args) {

        String s = countAndSay(6);
        System.out.println(s);
        boolean flag = isPalindrome(12334321);
        System.out.println(flag);

      String  str []  ={};
        String s1 = longestCommonPrefix(str);

        System.out.println(s1);
    }


    /**
     * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
     * <p>
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * 6.     312211
     * 7.     13112221
     * 1 被读作  "one 1"  ("一个一") , 即 11。
     * 11 被读作 "two 1s" ("两个一"）, 即 21。
     * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
     * 给定一个正整数 n ，输出报数序列的第 n 项。
     * 注意：整数顺序将表示为一个字符串。
     *
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        StringBuffer sb = new StringBuffer();
        if (n == 1) {
            sb.append("1");
        } else if (n == 2) {
            sb.append("11");
        } else {
            String result = countAndSay(n - 1);
            char temp = result.charAt(0);
            int count = 1;
            for (int i = 1; i < result.length(); i++) {
                if (temp == result.charAt(i)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(temp);
                    count = 1;
                    temp = result.charAt(i);
                }
            }
            if (temp == result.charAt(result.length() - 1)) {
                sb.append(count);
                sb.append(temp);
            }

        }
        return sb.toString();
    }

    /**
     * 判断一个整数是否是回文数。回文数是指正序
     * （从左向右）和倒序（从右向左）读都是一样的整数。
     * 你能不将整数转为字符串来解决这个问题吗？
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String s = String.valueOf(x);
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }


    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * <p>
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();

        if (strs.length==0){
            return "";
        }
        int size = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (size > strs[i].length()) {
                size = strs[i].length();
            }
        }




        for (int i = 0; i < size; i++) {
            sb.append(strs[0].charAt(i));
            for (int j = 0; j < strs.length; j++) {
                if (sb.charAt(i)!=strs[j].charAt(i)) {
                    sb.deleteCharAt(sb.length() - 1);
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }


}
