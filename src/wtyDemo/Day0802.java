package wtyDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day0802 {

    public static void main(String[] args) {

//        List l1 = new ArrayList<>();
//        ArrayList l = new ArrayList<>();
//        System.out.println(l.equals(l1));

        String prn = prn();
        System.out.println(prn);
    }

    public   static  String   prn() {

        try{
            int nn=10/0;
            return "a";
        }catch (Exception e){
            return "b";
        }finally {
            return "c";
        }
    }
}
