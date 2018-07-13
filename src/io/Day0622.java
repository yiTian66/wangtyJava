package io;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Day0622 {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress remote = InetAddress.getByName("wxxcxxx.top");
        InetAddress remote = InetAddress.getByName("www.baidu.com");
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("本机的IP地址："+localHost.getHostAddress());
        System.out.println("我的IP地址："+remote.getHostAddress());
        System.out.println("我的主机名为："+remote.getHostName());
    }
}
