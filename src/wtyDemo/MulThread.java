package wtyDemo;

import java.util.Random;

public class MulThread implements  Runnable{
    private  String name;

    public MulThread(String name) {
        this.name = name;
    }


    /**
     * 方法中先在命令行显示该线程信息，
     * 然后随机休眠小于1秒的时间，
     * 最后显示线程结束信息: " finished" +线程名
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().toString());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            System.out.println("睡眠异常");
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"   "+System.currentTimeMillis());

    }
}
