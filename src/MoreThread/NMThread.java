package MoreThread;

public class NMThread {
    public static void main(String[] args) {
        //匿名内部类方式创建线程
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + "第一种方式");
            }
        };

        t.start();
        //第二种方式
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "第二种方式");
            }
        };

        Thread t2 = new Thread(r);
        t2.start();

        //第三种方式


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "第三种方式");
            }
        });
        t3.start();
    }
}
