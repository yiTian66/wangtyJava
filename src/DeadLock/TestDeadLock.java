package DeadLock;

public class TestDeadLock {
    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        Thread t1 = new Thread(dl);
        Thread t2 = new Thread(dl);
        t1.start();
        t2.start();
    }
}
