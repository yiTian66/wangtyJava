package io;

import java.io.File;

/**
 * windows默认gbk编码，一个汉字两个字节表示，
 * 字节流是一个字节一个字节读取的，所以会有乱码。
 * 可以复制，复制完了再看没问题。字节流可以操作中文，但是不方便。
 * java中的char类型用的unicode，国际标准码表。
 * String是按照系统默认码表来解析的
 */

public class Day0620 {
    public static void main(String[] args) {
        //使用递归，遍历 1 至100之间的每个数字
        // math(100);
        //键盘录入一个路径，如果不是文件夹，并且是.java文件，那么把文件更改为.txt文件
        //judge("d:\\linshi\\1314.java");
        //给定一个文件夹，递归打印这个文件夹下的所有.java文件的绝对路径（包含子文件夹）
        testJava("d:\\linshi\\测试文件夹");
    }

    /**
     * 给定一个文件夹，递归打印这个文件夹下的
     * 所有.java文件的绝对路径（包含子文件夹）
     *
     * @param s
     */
    private static void testJava(String s) {
        File file = new File(s);
        //判断文件是否存在
        if (file.exists()) {
            File[] files = file.listFiles();
            for (File f : files
                    ) {
                if (f.isDirectory()) {
                    testJava(f.getAbsolutePath());
                } else {
                    //判断是否为.java结尾
                    if (f.getName().toLowerCase().endsWith(".java")) {
                        System.out.println(f.getAbsolutePath());
                    }

                }
            }

        } else {
            System.out.println("此文件不存在");
        }
        //////////////////////////////////////////////////////////////
    }


    //使用递归，遍历 1 至100之间的每个数字
    public static void math(int a) {
        if (a > 0) {
            System.out.println(a--);
            math(a);
        }

    }


    /**
     * 键盘录入一个路径，如果不是文件夹，并且是.java文件，
     * 那么把文件更改为.txt文件
     *
     * @param url
     */
    public static void judge(String url) {
        File file = new File(url);
        if (file.isDirectory()) {
            System.out.println("这是一个文件夹");
        } else {
            String name = file.getName();
            if (name.toLowerCase().endsWith(".java")) {
                //把文件更改为.txt
                String namea = url.substring(0, url.length() - 5);
                File a = new File(namea + ".txt");
                boolean b = file.renameTo(a);
                System.out.println(b);
            }

        }


    }


}
