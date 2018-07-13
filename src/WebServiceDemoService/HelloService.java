package WebServiceDemoService;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloService {
    public static void main(String[] args) {
        //服务提供者
        HelloService helloService = new HelloService();
        //服务地址
        String address="http://localhost:8080/hello";
        //调用jdk的Endpoint类来发布服务
        Endpoint.publish(address,helloService);
    }


    public String SayHello(String name){

        System.out.println("服务被调用了!!!");
        return "Hello " +name;
    }
}
