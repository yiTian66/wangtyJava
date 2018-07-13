package MoreThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程安全问题两种解决办法
 * 同步的原理：有锁的线程执行。没锁的线程等待。
 * 同步代码块： synchronized (任意对象：锁对象、官方语言：对象监视器。保证锁的唯一性。一般写this) {要同步的代码块}
 * 同步方法：在方法的返回值前面加上关键字synchronized
 * 同步方法有锁吗？锁是谁？锁就是this
 * 同步方法可以是静态的吗？可以。锁还是this吗？不是。锁对象是(类名.class)
 *  Lock解决线程安全 JDK 1.5出现
 *  ReentrantLock implementsLock 接口
 *  释放锁写在finally里面保证释放锁。synchronized不一定释放锁
 *
 *
 */
public class Sell implements Runnable {

    private static int ticket = 100;
    //创建对象
    Lock l=  new ReentrantLock();
    @Override
    public void run() {
        synchronized (this) {
            //获取锁
            l.lock();
            while (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "售出" + ticket);
                ticket--;
            }
            //释放锁
            l.unlock();

        }
    }
}
