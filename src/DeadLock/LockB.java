package DeadLock;

public class LockB {
    //保证锁的唯一性
    public static final LockB lockb=new LockB();
    private LockB (){};
}
