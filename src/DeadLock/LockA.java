package DeadLock;

public class LockA {
    //保证锁的唯一性
    public static final LockA locka=new LockA();
    private LockA (){};
}
