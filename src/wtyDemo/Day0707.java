package wtyDemo;

/**
 * 编写多线程程序，创建 10 个线程，每个线程完成一个计算任务，各
 * 个线程的计算任务是类似的：比如，从 1 加到 10(或从 1 乘到 10)，从
 * 11 加到 20(或从 11 乘到 20)，…..，从 91 加到 100(或从 91 乘到 100)。
 * 会用 for 循环创建这 10 个线程对象，用构造方法传入的参数来确定
 * 各个线程的计算任务。
 */
public class Day0707 {
    public static void main(String[] args) {
        for (int i = 0, j = 1; i < 10 && j < 100; i++, j = j + 10) {
            Task task1 = new Task(j, j + 9, "+");
            Thread t = new Thread(task1);
            t.start();
        }
        for (int i = 0, j = 1; i < 10 && j < 100; i++, j = j + 10) {
            Task task1 = new Task(j, j + 9, "*");
            Thread t = new Thread(task1);
            t.start();
        }
    }
}

