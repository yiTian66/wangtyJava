package wtyDemo;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import static java.util.Calendar.YEAR;

public class Day1123 {
    public static void main(String[] args) {
        Person p = new Person();
        if (p instanceof Person) {
            System.out.println("這是真的");

        }
        ;
        //这是真的

        Date data=new Date();
        DateFormat df = new SimpleDateFormat("YY-MM-dd:HH:mm:ss");
        String s = df.format(data);


        Calendar c = Calendar.getInstance();
        int i = c.get(YEAR);
        System.out.println(i);
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.gc();
        Properties pp = System.getProperties();
        Object o = pp.get("java.home");
        Object oo = pp.get("user.name");
        System.out.println(o.toString());
        System.out.println(oo.toString());
        //System.out.println(s);
        //System.out.println(data);
       // getOne(1);
    }


    public static int getOne(int a) {

        if (a == 1) {
            throw new NullPointerException("aaaaaaaaaaaa");
        }


        return 1;


    }
}
