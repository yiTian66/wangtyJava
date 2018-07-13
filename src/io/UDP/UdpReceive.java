package io.UDP;



import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpReceive {
    /**
     *
     * UDP接收端
     *
     * 1,创建DatagramSocket对象
     * 2,创建DatagramPacket对象
     * 3,接收数据存储到DatagramPacket对象中
     * 4,获取DatagramPacket对象的内容
     * 5,释放流资源
     * @param args
     */
    public static void main(String[] args) throws IOException {

        //1,创建DatagramSocket对象指定端口号
        DatagramSocket ds = new DatagramSocket(12306);

        //2,创建一个空仓库
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);

        //3,接收数据存储到DatagramPacket对象中
        ds.receive(dp);

        //4,获取DatagramPacket对象的内容
        InetAddress address = dp.getAddress();
        //获取发送人的ip地址
        String ipAddress = address.getHostAddress();

        //发送的具体内容
        byte[] data = dp.getData();

        //发送的内容长度
        int length = dp.getLength();
        String s = new String(data,0, length);

        System.out.println("数据源的IP："+ipAddress);
        System.out.println("数据内容："+s);


        //释放流资源
        ds.close();
    }
}
