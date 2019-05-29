package wtyDemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Day0212 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String time = new SimpleDateFormat("YYYY-MM-dd a hh:mm:ss").format(new Date());
        System.out.println(time);
        boolean b= 3*0.1==0.3;



        while (true) {
            String s = sc.next();
            for(int i=s.length();--i>=0;){
                int chr=s.charAt(i);
                if(chr<48 || chr>57)
                    System.out.println("不是");
            }

            Pattern p = Pattern.compile("[0-9]*");
            boolean matches = p.matcher(s).matches();
            System.out.println(matches);
            switch (s) {
                case "a":
                    System.out.println("不是这个");
                    System.out.println(b);
                    break;
                case "b":
                    System.out.println("输入有误");
                case "c":
                    System.out.println("请重新输入");
                    break;
                case "d":
                    System.out.println("看清楚了吗");
                    break;
                default:
                    System.out.println("请看说明书。。。");

            }
        }


    }


}
