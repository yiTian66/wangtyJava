package wtyDemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Day1126 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = dtf.format(now);
        System.out.println(format);
        LocalTime now1 = LocalTime.now();
        LocalTime max = LocalTime.MAX;
        long l = Duration.between(now1, max).toMillis();

        System.out.println("hello");
        System.out.println(l);

        double ceil = Math.ceil(1.11);
        double abs = Math.abs(-1.1);
        double pow = Math.pow(2, -10);
        double random = Math.random();
        System.out.println("----------------");
        System.out.println(random);
        System.out.println(pow);
        System.out.println(abs);
        System.out.println(ceil);
        System.out.println("正则");
        String qq = "604154942";
        String regex = "[1-9][0-9]{4,14}";
        boolean matches = qq.matches(regex);
        System.out.println(matches);

        ArrayList<String> list = new ArrayList<>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(1, "d");

        System.out.println(list);


        Map<String, String> map = new HashMap();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
            System.out.println(map.get(next));
        }

        System.out.println("---------------------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + "..." + value);
            System.out.println("===============================");

        }

        System.out.println("===================");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("===================");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("==============");


    }
}
