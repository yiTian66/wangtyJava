package wtyDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day0709 {
//    public static void main(String[] args) {
//        List a = new ArrayList();
//        Map b =new HashMap();
//        a.add(1);
//        b.put("a",a);
//        System.out.println(a);//[1]
//        System.out.println(b);//{a=[1]}
//
//        a.add(2);
//        System.out.println(a);//[1,2]
//        System.out.println(b);//{a=[1,2]}
//    }


    //手写一个单例
    //私有的构造函数，公共的访问方法
    //private static Day0709 d=new Day0709();
//
//    private Day0709(){};
//    public static Day0709 getDay0709(){
//        return d;
//    } private static Day0709 d=new Day0709();


//    private static Day0709 d;
//
//    private Day0709() {
//    }
//
//    ;
//
//    public Day0709 getDay0709() {
//        if (d == null) {
//            synchronized (this) {
//                if (d == null) {
//                    d = new Day0709();
//                }
//            }
//        }
//        return d;
//    }


    public static void main(String[] args) throws Exception {

        String in = "I am fine , thank you";
        String revers = revers(in);
        System.out.println(revers);
        boolean b = copyFile(new File("d:\\linshi\\宇哥.jpg"), new File("d:\\linshi\\宇哥复制品"+System.currentTimeMillis()+".jpg"));
        System.out.println(b);


    }

    public static String revers(String in) {
        String[] ins = in.split(" ");
        String result = "";
        for (int i = ins.length - 1; i >= 0; i--) {
            result = result + ins[i] + " ";
        }


        return result;
    }


    public  static  boolean copyFile(File srcFile, File dstFile) throws Exception {
        boolean f = srcFile.exists();
        boolean fd = dstFile.exists();
       // boolean f = srcFile.isDirectory();
        if (!f){
            return false;
        }
        if (!fd){
            dstFile.createNewFile();
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dstFile));

        int len = 0;
        byte[] bytes = new byte[1024];

        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
        return true;
    }

}
