package wtyDemo;

public class Day0803 {
    public static   int a = 1;

    public static void main(String[] args) {

        Day0803 d=new Day0803();

        System.out.println(a);
        d.add();
        //System.out.println(a);
        d.add2();
        System.out.println(a);
    }

    public  void add() {
        a=a+1;
    }

    public  void add2() {
        a = a+2;
    }


}
