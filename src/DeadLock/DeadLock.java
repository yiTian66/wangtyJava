package DeadLock;

public class DeadLock implements Runnable {
    int i = 0;

    @Override
    public void run() {
        while (true) {
            if (i % 2 == 0) {
                //两把锁，先A后B
                synchronized (LockA.locka) {
                    System.out.println("if...拿到A锁了");
                    synchronized (LockB.lockb) {
                        System.out.println("if...拿到B锁了");
                    }
                }


            } else {

                //两把锁，先B后A
                synchronized (LockB.lockb) {
                    System.out.println("else...拿到B锁了");
                    synchronized (LockA.locka) {
                        System.out.println("else...拿到A锁了");
                    }
                }
            }
            i++;
        }

    }
}
