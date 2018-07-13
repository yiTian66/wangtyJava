package WebServiceDemo1;

import WebServiceDemo1.cn.com.webxml.QqOnlineWebService;
import WebServiceDemo1.cn.com.webxml.QqOnlineWebServiceSoap;

public class App {
    public static void main(String[] args) {
        //获取服务
        QqOnlineWebService ws =new QqOnlineWebService();
        //通过服务获取代理对象
        QqOnlineWebServiceSoap proxy = ws.getQqOnlineWebServiceSoap();
        //方法
        String s = proxy.qqCheckOnline("1107701571");
        System.out.println(s);

    }
}
