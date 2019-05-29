//package wtyDemo;
//
//import com.mysql.jdbc.util.Base64Decoder;
//import sun.misc.BASE64Encoder;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class Day0121 {
//    void f(){
//        System.out.println("Day0121.f");
//    }
//}
//
//class Day0121B extends Day0121{
//
//    void f(int i) {
//        System.out.println("Day0121B.f");;
//    }
//}
//class Day0121C extends Day0121B{
//    @Override
//    void f() {
//        System.out.println("Day0121C.f");;
//    }
//}
//
//class D{
//    public static void main(String[] args) {
//
//        Base64Decoder.decode();
//
//        Day0121 a = new Day0121();
//        a.f();
//
//        Day0121B b = new Day0121B();
//        b.f();
//
//        Day0121C c = new Day0121C();
//        c.f();
//
//        //两种方式遍历HashMap
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("a","aaaaa");
//        map.put("","bbbbb");
//        map.put("c","");
//        map.put(null,"ddddd");
//        map.put("e",null);
//        map.put(null,null);
//        map.put("g","ggggg");
//        map.forEach((k, v) -> {
//            System.out.println(k + "：" + v);
//        });
//
//
////        Set<Map.Entry<String, Object>> entry = map.entrySet();
////        for (Map.Entry<String,Object>  e: entry
////             ) {
////            System.out.println(e.getKey()+"..."+e.getValue());
////        }
////
////        System.out.println("============");
////        Set<String> ss = map.keySet();
////        for ( String s:ss
////             ) {
////            System.out.println(map.get(s));
////        }
////
//
//
//
//    }
//}
//
