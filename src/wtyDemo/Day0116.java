package wtyDemo;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Day0116 {
    public static void main(String[] args) {
        /**
         *   编写一个随机点名系统，运行该系统后，
         *   按空格键可以显示出一名同学，以前被选中的同学，
         *   将不会再次被选中
         */
        dianMing();
    }

    /**
     * 点名方法
     */
    private static void dianMing() {
        HashMap<String, String> PeopleMap = new HashMap<>();
        PeopleMap.put("1","张1");
        PeopleMap.put("2","张2");
        PeopleMap.put("3","张3");
        PeopleMap.put("4","张4");
        PeopleMap.put("5","张5");
        PeopleMap.put("6","张6");
        PeopleMap.put("7","张7");
        PeopleMap.put("8","张8");
        PeopleMap.put("9","张9");
        PeopleMap.put("0","张0");

        Random r = new Random();
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("按下空格点名");
            String s = sc.nextLine();
            if (s.equals("a")){
                int i = r.nextInt(10);
                System.out.println("恭喜你，幸运儿  "+PeopleMap.get(String.valueOf(i)));
            }  else {
                System.out.println("告诉你了别瞎几把按");
            }

        }








    }
}
