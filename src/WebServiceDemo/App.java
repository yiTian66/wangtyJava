package WebServiceDemo;

import WebServiceDemo.cn.com.webxml.MobileCodeWS;
import WebServiceDemo.cn.com.webxml.MobileCodeWSSoap;

/**
 * 搜索webxml找第二个进入网站http://www.webxml.com.cn/zh_cn/web_services.aspx
 * 找到你需要的服务，
 */
public class App {
    public static void main(String[] args) {
        //获取服务  服务的名字就是<wsdl:service name="MobileCodeWS"> name值
        MobileCodeWS ws=new MobileCodeWS();
        //通过服务获取代理对象 <wsdl:port name="MobileCodeWSSoap" binding="tns:MobileCodeWSSoap">  get+name值
        MobileCodeWSSoap proxy = ws.getMobileCodeWSSoap();
        //执行服务
        String mobileCodeInfo = proxy.getMobileCodeInfo("18911184581", null);
        System.out.println(mobileCodeInfo);
    }
}
