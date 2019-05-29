package wtyDemo;

import java.time.LocalDateTime;

public  class Day0214 implements Runnable{

float f= (float) 3.4;


       static int i=0;

    public static void main(String[] args) throws InterruptedException {


        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println("============");
        System.out.println(s1 == s2);//F
        System.out.println(s1 == s5);//T
        System.out.println(s1 == s6);//F
        System.out.println(s1 == s6.intern());//T
        System.out.println(s2 == s2.intern());//F
        System.out.println("============");
        String ss = reverse("abcdefg");
        System.out.println(ss);
        System.out.println(ss.substring(1));

        long a = Math.round(11.5);
        long b = Math.round(-11.5);
        int i = 2 << 4;
        System.out.println(i);
        System.out.println(a+"dddddd"+b);
        int[] ints = new int[10];
        int l = ints.length;
        System.out.println(l);

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);

        System.out.println("aaaaaaaaaaa"+yesterday);
        Day0214 d1 = new Day0214();
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(Day0214.i);


    }


    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    public static String ssss(String asd){
        if(asd==null|| asd.length()<=1){
            return asd;
        }
        return ssss(asd.substring(1)+asd.charAt(0));


    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程任务类。。。");
       A:
        for (int j=0;j<10000;j++){
            i++;


            }









    }
}
