package wtyDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Day0228 {

    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();

        Map<String, String> ht = new Hashtable<>();
        hm.put("qs","a");
        hm.put("a","");
        hm.put(null,"");
        hm.put("",null);
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry<String, String> e  :entries
             ) {
            System.out.println("key: "+e.getKey() +"  "+"value: "+e.getValue());
        }

//
//       ht.put("qs","a");
//       ht.put("a","");
//       ht.put(null,"");
//       ht.put("",null);
//
//        Set<Map.Entry<String, String>> entries1 = ht.entrySet();
//        while (entries1.iterator().hasNext()){
//            Map.Entry<String, String> next = entries1.iterator().next();
//            String key = next.getKey();
//            String value = next.getValue();
//            System.out.println("key: "+key +"  "+"value: "+value);
//
//        }


        int a=5;
        int b=10;
        System.out.println(a+~b);
        System.out.println(~b);
        System.out.println(~b);


    }


}
