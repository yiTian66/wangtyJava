package wtyDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Day1130 {
    public static void main(String[] args) throws InterruptedException, UnknownHostException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"...");
            }
        });
        t.start();
        //t.sleep(1000);
        //t.wait();
       // t.notify();

        InetAddress localHost = InetAddress.getLocalHost();
        String hostName = localHost.getHostName();
        String hostAddress = localHost.getHostAddress();
        byte[] address = localHost.getAddress();
        String s = localHost.toString();
        System.out.println("==================");
        System.out.println(hostName);
        System.out.println(hostAddress);
        System.out.println(address);
        System.out.println(s);

    }
}
