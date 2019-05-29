package wtyDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Day0227 {
    public static void main(String[] args) {


//        Boolean b = new String("abc").equals(new String("abc"));
//        System.out.println(b);
//
//
//        Boolean c = new StringBuffer("abc").equals(new StringBuffer("abc"));
//        System.out.println(c);

//        long l = System.currentTimeMillis();
//        String s = new String();
//        for (int i = 0; i <10000 ; i++) {
//            s=s+i;
//        }
//        long l1 = System.currentTimeMillis();
//
//        System.out.println("l1:    "+(l1-1));
//
//
//
//        long l2 = System.currentTimeMillis();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i <10000 ; i++) {
//            sb=sb.append(i);
//        }
//
//
//        long l3 = System.currentTimeMillis();
//        System.out.println("l3:    "+(l3-l2));

//        Timer t = new Timer();
//        TimerTask tt = new TimerTask() {
//            int i = 1;
//            @Override
//            public void run() {
//                System.out.println("我爱你。。。" + i++);
//            }
//        };
//
//        t.schedule(tt, 1000, 1000);


//        List<String> list = Arrays.asList("1", "2", "3", "a", "b", "c");
//        System.out.println(list);
        Person person = new Person();
        ThreadLocal t = new ThreadLocal();
        Object o = t.get();
        String s = new String("12.36.22");
        String[] split = s.split("\\.");
        System.out.println(Arrays.toString(split));

    }
}
