package WebServiceDemoClient;

import WebServiceDemoClient.webservicedemoservice.HelloService;
import WebServiceDemoClient.webservicedemoservice.HelloServiceService;

public class App {
    public static void main(String[] args) {
        HelloServiceService ws = new HelloServiceService();
        HelloService proxy = ws.getHelloServicePort();
        String s = proxy.sayHello("依天");
        System.out.println(s);
    }
}
