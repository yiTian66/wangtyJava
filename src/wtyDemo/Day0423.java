package wtyDemo;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Day0423 {
    public static void main(String[] args) {
//       a: for (int i = 0; i <10 ; i++) {
//            System.out.println("我是1层循环"+i);
//            b:
//            for (int j = 0; j <10 ; j++) {
//                System.out.println("我是2层循环"+j);
//               c: for (int k = 0; k <10 ; k++) {
//                    System.out.println("我是3层循环"+k);
//                    break b;
//                }
//            }
//        }

int[] arr=new int[]{1,2,3,33,44,4,5,6,33};
Arrays.sort(arr,0,2);
        int[] ints = Arrays.copyOf(arr, 3);
        int[] ints1 = Arrays.copyOfRange(arr, 2, 4);
//Arrays.fill(arr,10);
//        System.out.println(arr);
       System.out.println(Arrays.toString(arr));
//
//        System.out.printf("");
//        System.out.println("Day0423.main");
//        System.out.println("args = [" + args + "]");
//        System.out.println("arr = " + arr);
//        System.err.println("ssssssssss");


        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.contains("a");
//        for (int i = 0; i <list.size() ; i++) {
//            if (i==3){
//                String remove = list.remove(i);
//                System.out.println("remove = " + remove);
//                System.out.println("remove = " + remove);
//            }
//            System.out.println(list.get(i));
//        }

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
////            System.out.println("iterator = " + iterator);
//            iterator.remove();
//            System.out.println(iterator.next());
//        }


        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));


    }
}
