package MoreThread;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++){
            Thread.sleep(1);
            System.out.println(i);

        }
    }
}
