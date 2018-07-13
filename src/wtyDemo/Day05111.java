package wtyDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Day05111 {
    public static void main(String[] args) throws ParseException {
        Map<String,String> map=new HashMap<>();
        map.put("name","jack");
        map.put("name","rose");
        System.out.println(map.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);
        long l = System.currentTimeMillis();
        System.out.println(l);
//        Date parse = sdf.parse("");
//        long time = parse.getTime();


    }
}
