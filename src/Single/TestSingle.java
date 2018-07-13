package Single;

public class TestSingle {
    public static void main(String[] args) {
//        System.out.println("=============饿汉式=============");
//        for (int i = 0; i <10 ; i++) {
//            Single s = Single.getSingle();
//            System.out.println("饿汉式 : "+s);
//        }
//
//        System.out.println("=============懒汉式=============");
//        for (int i = 0; i <10 ; i++) {
//            Single2 s2 = Single2.getSingle2();
//            System.out.println("懒汉式 : "+s2);
//        }

        System.out.println("====================");
       SingleRun sr=new SingleRun();
//        SingleRun1 SR1 = new SingleRun1();
//        sr.start();
//        SR1.start();


       Thread t1 = new Thread(sr);
        Thread t2 = new Thread(sr);
        Thread t3 = new Thread(sr);
        Thread t4 = new Thread(sr);
        Thread t5 = new Thread(sr);
        Thread t6 = new Thread(sr);
        Thread t7 = new Thread(sr);
        Thread t8 = new Thread(sr);
        Thread t9 = new Thread(sr);
        Thread t10 = new Thread(sr);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

    }
}
