package wtyDemo;

import java.text.DecimalFormat;
import java.util.Calendar;

public class day0502 {
    public static void main(String[] args) {
//        Calendar instance = Calendar.getInstance();
//        System.out.println(instance);
        DecimalFormat d = new DecimalFormat(".####");
        String s = d.format(10.12345678);
        System.out.println(s);

        People p = new People();
        p.name = "小明";
        System.out.printf(p.name);

    }
}
