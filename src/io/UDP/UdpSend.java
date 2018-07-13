package io.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSend {

    /**
     *  发送端
     *
     * 1,创建DatagramSocket对象
     * 2，创建DatagramPacket对象，并封装数据
     * 3，发送数据
     * 4，释放流资源
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        //1,创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();

        //2,创建一个仓库，并封装数据
        //public DatagramPacket(byte[] buf, int length, InetAddress address,  int port)
        DatagramPacket dp = new DatagramPacket("Hello".getBytes(),"Hello".length(),InetAddress.getLocalHost(),12306);

        //3,发送数据
        ds.send(dp);

        //4,释放流资源
        ds.close();
    }
}
