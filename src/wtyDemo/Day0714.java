package wtyDemo;

import java.math.BigDecimal;

public class Day0714 {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        Long sum=0L;
//        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
//            sum+=i;
//        }
//        System.out.println(sum);
//       long end= System.currentTimeMillis();
//        System.out.println("Long"+(end-start));
//
//
//        long start1 = System.currentTimeMillis();
//        long sum1=0L;
//        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
//            sum1+=i;
//        }
//        System.out.println(sum1);
//       long end1= System.currentTimeMillis();
//        System.out.println("long"+(end1-start1));
        System.out.println(1.03-0.42);
        System.out.println(1-9*0.1);
//        BigDecimal bd=1.03;
        System.out.println(1.01+2.02);
        BigDecimal b1 = new BigDecimal("1.01");
        BigDecimal b2 = new BigDecimal("2.02");
        BigDecimal b3 = new BigDecimal(1.34);
        BigDecimal b4 = new BigDecimal("1.34");
        BigDecimal add = b1.add(b2);
        System.out.println(add);
        System.out.println(1.01+2.02);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);

    }

}
