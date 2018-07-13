package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Day062001 {

    public static void main(String[] args) throws IOException {
        /**
         * OutputStreamWriter字符通往字节的桥梁   指定编码
         *序列化流，被序列化的对象必须实现seril接口。否则不能被序列化
         * hashMap不允许null键和null值。hashtable允许。hashtable1.0出现，效率低，安全
         * hasnmap1.2出现，效率高，不安全。properties唯一可以喝io结合使用的集合
         */
        writeGBK();


    }


    public static void writeGBK() throws IOException {
        //创建转换流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\linshi\\8.txt"), "UTF-8");
        //调用write方法
        osw.write("刘乃源");
        osw.flush();
        //关闭资源
        osw.close();
    }
}
