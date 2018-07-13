package WebServiceDemo2;


import WebServiceDemo2.cn.com.webxml.ArrayOfString;
import WebServiceDemo2.cn.com.webxml.WeatherWS;
import WebServiceDemo2.cn.com.webxml.WeatherWSSoap;

import java.util.List;

/**
 * https://blog.csdn.net/jianfpeng241241/article/details/51627894
 * 包路径问题注意一下
 */
public class App {
    public static void main(String[] args) {
        //获取服务
        WeatherWS ws=new WeatherWS();
        //根据服务获取代理对象
        WeatherWSSoap proxy = ws.getWeatherWSSoap();
        //执行方法
        ArrayOfString result = proxy.getWeather("北京", null);
        List<String> string = result.getString();


        for (int i = 0; i <string.size() ; i++) {
            System.out.println(i+"   "+string.get(i));
        }
//       System.out.println(string.toString());

    }
}
