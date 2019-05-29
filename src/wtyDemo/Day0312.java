package wtyDemo;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Day0312 implements Runnable {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();


        Thread t1 = new Thread(new Day0312());
        t1.start();
        Thread t2 = new Thread(new Day0312());
        t2.start();


//        String[] workDays = {"1", "2", "33", "四", "五"};
//        List<String> s = Arrays.asList(workDays);
//       // s.addAll(s);
//        // boolean add = s.add("66");
//
////        System.out.println(add);
//        Collections.sort(s);
//        Collections.shuffle(s);
//        int i = 3 >>2;
//        System.out.println(i);
//
//        int j=3<<10;
//        System.out.println(j);
//
////        for (String ss : s
////                ) {
////            System.out.println(ss
////            );
////        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程任务类");
    }
}
