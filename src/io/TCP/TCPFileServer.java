package io.TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 文件上传，服务器端
 */
public class TCPFileServer {
    public static void main(String[] args) throws IOException {
        //创建服务器，等待客户端连接
        ServerSocket ss = new ServerSocket(8888);
        //创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(100);

        while (true) {


            Socket accept = ss.accept();
            //显示哪个客户端连接Soceket连接上了服务器
            InetAddress inetAddress = accept.getInetAddress(); //得到IP地址对象
            String hostAddress = inetAddress.getHostAddress(); //得到IP地址字符串
            System.out.println("小样，抓到你了 IP:" + hostAddress);

            Runnable runnable = () -> {
                try {
                    //获取socket的输入流
                    InputStream inputStream = accept.getInputStream();
                    Date date = new Date();
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                    String format1 = format.format(date);
                    //创建目的地的字节输出流
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\linshi\\"+format1+".jpg"));
                    //把socket输入流的数据，写到目的地的字节输出流当中
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = inputStream.read(bytes)) != -1) {
                        //写入目的地的字节输出流当中
                        bos.write(bytes, 0, len);
                    }
                    //----------------反馈信息-------------
                    //获取socket的输出流，写反馈信息给客户端
                    OutputStream outputStream = accept.getOutputStream();
                    //写反馈信息给客户端
                    outputStream.write("图片上传成功".getBytes());
                    outputStream.close();
                    bos.close();
                    inputStream.close();

                } catch (Exception e) {
                    e.printStackTrace();

                }
            };

            threadPool.submit(runnable);
        }


    }

}
