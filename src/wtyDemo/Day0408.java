package wtyDemo;

import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;

public class Day0408 {
    public static void main(String[] args) {
        //java8之前
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.printf("aaaaaaaaaaa");
            }
        }).start();

        //java8新特性
        new Thread(()-> System.out.println("bbbbbbbbbbb")).start();

        List<String> list = Arrays.asList("asdasd","11111","22222","333333");
        list.forEach(l->{
            System.out.println(l);
        });


        //java10新特性 局部变量类型推断 var 只能用作局部变量



    }
}
