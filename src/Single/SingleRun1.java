package Single;

public class SingleRun1 extends Thread {
    @Override
    public void run() {

        Single2 s2 = Single2.getSingle2();
        System.out.println("懒汉式 : " + Thread.currentThread().getName() + s2);
    }
}