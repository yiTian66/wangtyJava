package zhuanshizhe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 装饰着设计模式
 * 可以解决本身功能不变，在本来功能基础上添加新的功能
 */
public class ZSZTest {
    public static void main(String[] args) throws Exception {

        Phone phone = new Phone();
        ColoringPhone cp = new ColoringPhone(phone);
        //相当于下面写法
        ColoringPhone cp1 = new ColoringPhone(new Phone());
        cp.call();
        cp1.call();

        //装饰者设计模式我们一直在用，
        try (BufferedReader br = new BufferedReader(new FileReader("d:\\linshi.1.txt"))) {
        }
    }
}
