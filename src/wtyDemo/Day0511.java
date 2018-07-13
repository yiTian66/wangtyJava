package wtyDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day0511 {
    public static void main(String[] args) {
        //125789组成一个五位数至多用一次能被75整除有几个？
        List<Integer> list = new ArrayList<>();
        List<Integer> results = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        int count = 0;
        while (true) {
            Collections.shuffle(list);

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < list.size() - 1; i++) {
                sb.append(list.get(i));
            }
            String s = sb.toString();
            int result = Integer.parseInt(s);
            if ((result % 75) == 0 && !(results.contains(result))) {
                count++;
                results.add(result);
                System.out.println(count + "......." + result);
            }
        }


    }
}
