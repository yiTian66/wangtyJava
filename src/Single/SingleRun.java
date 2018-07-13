package Single;

public class SingleRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {

            Single2 s2 = Single2.getSingle2();
            System.out.println("懒汉式 : "+Thread.currentThread().getName()+"..."+ s2);
        }

    }
}
