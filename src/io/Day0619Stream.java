package io;


import java.io.*;

public class Day0619Stream {
    public static void main(String[] args) throws Exception {

        File fileA = new File("d:\\linshi\\哈哈哈");
        //out(file);

        //in(file);
        //in2(file);
        File fileB = new File("d:\\linshi\\嘿嘿嘿");

        // copy(fileA, fileB);
        //outBuffer(fileA);
        //inBuffer(fileB);
        copyFile(fileA,fileB);
    }


    /**
     * 将内存文件写入磁盘
     *
     * @param file
     */
    public static void out(File file) throws IOException {

        //创建一个用于操作文件的字节输出流对象。已创建就必须明确数据存储目的地
        //输出流目的是文件，会自动创建。如果目标文件存在，则覆盖
        FileOutputStream fos = new FileOutputStream(file, true);
        //调用父类的write方法
        byte[] bytes = "\r\n wwwqqqq".getBytes();
        fos.write(bytes);
        //关闭流资源
        fos.close();
    }


    /**
     * 将磁盘文件读取至内存中☞
     *
     * @param file
     * @throws IOException
     */
    public static void in(File file) throws IOException {

        //创建字节输入流对象，明确数据源
        FileInputStream fis = new FileInputStream(file);
        //使用read读取数据，一次读取一个字节
        int ch = 0;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }
        fis.close();
    }

    /**
     * 一次读取一个字节数组
     *
     * @param file
     * @throws IOException
     */
    public static void in2(File file) throws IOException {
        //创建字节输入流对象，明确数据源
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        //使用read读取数据，一次读取一个字节
        int ch = 0;
        while ((ch = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, ch));
        }
        fis.close();
    }

    /**
     * 从文件A复制到B
     *
     * @param fileA
     * @param fileB
     */
    public static void copy(File fileA, File fileB) throws Exception {
        //创建字节输出流绑定数据源
        FileInputStream fis = new FileInputStream(fileA);
        //创建字节输入流绑定数据目的地
        FileOutputStream fos = new FileOutputStream(fileB);
        int len = 0;
        byte[] bytes = new byte[1024];

        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
    }


    /**
     * 字节缓冲流
     *
     * @param file
     */
    public static void outBuffer(File file) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        bos.write("刮风减半，下雨全完".getBytes());
        bos.close();
    }

    /**
     * 字节缓冲流
     *
     * @param file
     */
    public static void inBuffer(File file) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {

            System.out.println(new String(bytes, 0, len));

        }

    }

    //复制单级文件夹

    /**
     * 复制单级文件夹
     *
     * @param a
     * @param b
     */
    public static void copyFile(File a, File b) throws Exception {
        //判断目的地是否存在，不存在则创建
        if (!b.exists()) {
            b.mkdir();
        }

        File[] files = a.listFiles();
        for (File f : files
                ) {
           String name= f.getName();
          File fb= new File(b,name);
          copy(f,fb);

        }


    }


}
