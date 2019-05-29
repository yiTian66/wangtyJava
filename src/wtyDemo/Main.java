package wtyDemo;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        HashMap<Object, Object> map = new HashMap<>();

        map.put("a","s");
        int i=0;
        while (true){
            list.add(i++);
            System.out.println(i);
        }


    }
}
