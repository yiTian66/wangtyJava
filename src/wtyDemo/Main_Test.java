package wtyDemo;


/**
 * webService 测试类
 */
public class Main_Test {

    public static void main(String[] args) throws Exception {

        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();

        while (true) {
            if (td.getFlag()) {
                System.out.println("主线程flag:" + td.getFlag());
                break;
            }
        }

    }

}

class ThreadDemo implements Runnable {

    //共享变量
    private  boolean flag = false;

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
        flag = true;

        System.out.println("其他线程flag=" + getFlag());
    }
}

