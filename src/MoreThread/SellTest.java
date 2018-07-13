package MoreThread;

public class SellTest {
    public static void main(String[] args) {
        Sell s = new Sell();
        Thread t1 = new Thread(s);
        t1.start();
        Thread t2 = new Thread(s);
        t2.start();
        Thread t3 = new Thread(s);
        t3.start();
        Thread t4 = new Thread(s);
        t4.start();


    }
}
