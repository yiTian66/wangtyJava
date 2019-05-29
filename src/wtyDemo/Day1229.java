package wtyDemo;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Day1229 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int i=0;
        int count=0;
        Random r = new Random();
//        while (i!=10){
//
//            i = r.nextInt(100);
//            System.out.println(i+"   "+count++);
//        }


        String a="ceshiyongde测试用的";

        String ae = URLEncoder.encode(a, "gbk");
        System.out.println("ae:  "+ae);
        String ad = URLDecoder.decode(ae, "gbk");
        System.out.println("ad:  "+ad);

        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
int asd=0;
        String s = String.valueOf(++asd);
        System.out.println(s);

        System.out.println(time);

    }



}

