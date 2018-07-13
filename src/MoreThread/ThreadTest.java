package MoreThread;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo1 td = new ThreadDemo1();
        td.setName("老大");
        td.start();
        ThreadDemo1 td1 = new ThreadDemo1();
        td1.setName("老二");
        td1.start();
        String name = Thread.currentThread().getName();
        System.out.println(name);

        System.out.println("========创建线程的第二种方式========");
        ThreadDemo2 td2 = new ThreadDemo2();
        Thread t1 = new Thread(td2);
        t1.start();
        Thread t2 = new Thread(td2);
        t2.start();


        new Thread(){
            @Override
            public void run() {
                System.out.println("内部类方式继承thread类："+getName());
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("内部类方式实现runnable接口方式："+Thread.currentThread().getName());
            }
        }).start();
    }
}
