package wtyDemo;

import java.util.Random;

public class Day0507 {

    public static void main(String[] args) {
        int count=0;
        Random r = new Random();
        while (true){
            int i = r.nextInt(101);
            System.out.println("随机数："+(count++)+"  "+i);
            if (i==88){
                break;
            }

        }
    }
}
