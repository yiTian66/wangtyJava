package wtyDemo;

public class Task implements Runnable {

    private int began;
    private int end;
    private String flag;

    public Task(int began, int end, String flag) {
        this.began = began;
        this.end = end;
        this.flag = flag;
    }

    @Override
    public synchronized void run() {
        if (flag.equals("+")) {
            int result = began;
            for (int i = began; i <= end; i++) {
                result = result + i;
            }

            System.out.println(Thread.currentThread().getName() + "..." + began + "..." + end + "..." + flag + "..." + result);
        } else if (flag.equals("*")) {
            Long result = (long) began;
            for (int i = began; i <= end; i++) {
                result = result * i;
            }
            System.out.println(Thread.currentThread().getName() + "..." + began + "..." + end + "..." + flag + "..." + result);
        }


    }
}
