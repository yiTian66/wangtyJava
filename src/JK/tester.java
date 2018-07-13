package JK;

import java.util.ArrayList;
import java.util.List;

public class tester {
    public static void main(String[] args) {
//        tester t = new tester();
//        MathOperation addition =  (int a,int b)->a+b;
//        int i = t.operate(1, 2, addition);
//        System.out.println(i);
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }


    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
