package wtyDemo;

public class Day0222  implements Runnable{
    int i=100;


    public static void main(String[] args) {
        System.out.println("---------------------");

        Day0222 d = new Day0222();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        Thread t3 = new Thread(d);


        t1.start();
        t2.start();
        t3.start();


    }


    @Override
    public void  run() {
       synchronized (this){ while (i>0){
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName()+"卖出"+i--+"号票");

       }}


    }

}
