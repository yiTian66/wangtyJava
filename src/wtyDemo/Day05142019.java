package wtyDemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;
import static java.util.concurrent.Executors.newSingleThreadExecutor;

//https://blog.csdn.net/qq_29373285/article/details/85238728 线程池讲解
public class Day05142019 {
    public static void main(String[] args) throws InterruptedException {

        // pool1();
        // pool2();
//        pool3();
//        new Object().wait();
        String [] student =new String []{"姓名","学号","性别","A成绩","A学分","B成绩","B学分","C成绩","C学分"};




    }

    private static void pool3() throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            boolean f=true;
            @Override
            public void run() {
                while (f) {
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                   // if (f){f=false;}
                }
                if (f){f=false;}
            }
        });
        t.start();
        Thread.sleep(Long.parseLong("2222"));
        t.stop();


    }

    private static void pool2() {

        ExecutorService e = newFixedThreadPool(2);

        e.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "1111");
            }
        });
        e.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "2222");
            }
        });
        e.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "3333");
            }
        });
    }

    public static void pool1() {

        ExecutorService e = newSingleThreadExecutor();
        e.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "1111");
            }
        });
        e.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "2222");
            }
        });


    }

    ;
}
