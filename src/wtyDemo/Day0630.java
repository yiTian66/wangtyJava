package wtyDemo;

import java.util.*;

public class Day0630 {


    public  static String sss="111";
    /**
     * 编写一个程序，将数字从键盘读入int[ ]类型的数组中。
     * 你可以假设数组中最多有50个条目。你的程序最多允许输入50个数字。
     * 输出为一个两列的列表。第一列列出了不同的数组元素；
     * 第二列是每个元素的出现次数。
     * 这个列表应该按照第一列条目从大到小的顺序排序
     *
     * @param args
     */
    public static void main(String[] args) {

//        int num = 0;
//        Scanner s = new Scanner(System.in);
//        Integer[] ints = new Integer[50];
//        System.out.println("请输入50个以内的数字，以“.”结尾");
//        for (int i = 0; i < ints.length; i++) {
//            String next = s.next();
//            if (".".equals(next)) {
//                break;
//            }
//            ints[i] = Integer.parseInt(next);
//            num = i+1;
//        }
//        List<Integer> ints1 = Arrays.asList(ints);
//        //得到实际长度的集合
//        List<Integer> integers = ints1.subList(0, num);
//        Set<Integer> ints2 = new TreeSet(integers);
//
//        for (Iterator ite = ints2.iterator(); ite.hasNext(); ) {
//            Integer i = (Integer) ite.next();
//
//            //从数组中获取该元素出现的次数
//            int j = Collections.frequency(ints1, i);
//            System.out.println("[" + i + "," + j + "]");
//        }


        pri();

    }



    public static void pri(){
        System.out.println("这是一个死递归，没有出口的！！！");
        pri();
    }

}
