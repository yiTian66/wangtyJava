package MoreThread;

public class ThreadDemo1 extends Thread{

    public ThreadDemo1() {
    }

    /**
     * 线程任务
     */
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {

            System.out.println(this.getName()+"..."+i);
        }




    }
}
