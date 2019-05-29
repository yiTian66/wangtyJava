package wtyDemo;

public class Day0509 {
    static  int 包=100;
    static  int 实体=0;
    static  int 网店=0;
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (包>0) {
                包=包-1;
                实体=实体+1;
                    System.out.println("实体"+实体+"包"+包);
                }
            }
        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
               while (包>0){
               包=包-1;
               网店=网店+1;
                   System.out.println("网店"+网店+"包"+包);
                }
            }
        });
        t.start();
        t1.start();
        t1.join();
        t.join();
        System.out.println(实体);
        System.out.println(网店);
        System.out.println(包);


    }



}
