package wtyDemo;

/**
 * Created by wkb on 2018/8/29.
 */
class ThreadDemo1 implements Runnable {

    //共享变量
    private    boolean flag = false;

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

    public static void main(String[] args) throws Exception {
        ThreadDemo1 td = new ThreadDemo1();
        new Thread(td).start();

        while (true) {

            Thread.sleep(100);
            if (td.getFlag()) {
                System.out.println("主线程flag:" + td.getFlag());
                System.exit(0);
                break;
            }
        }
    }
}