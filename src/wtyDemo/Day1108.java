package wtyDemo;

import java.util.ArrayList;

public class Day1108 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JavaSE,骑");
        list.add("JavaEE,猪");
        list.add("JavaWeb,上");
        list.add("JavaEE,高");
        list.add("JavaME,速");
        System.out.println(list);
        System.out.println(list.toString()+"aaaaaaaaaaaaa");

        list.remove(0);
        System.out.println(list);
        list.set(1, "Android");
        String str = list.get(1);
        System.out.println(str);
       // i＝（c==65‖c＝=69‖c=＝75）？“is ok”:“is no ok”

        String i;
        int c=1;
        i=(c==65||c==69||c==75)?"is ok":"is no ok";
        System.out.println(c+i);

    }
}
