package wtyDemo;

public class Day0704 {
    public static void main(String[] args) {
        for (int i = 0; i <6 ; i++) {
            if (i%2==1){
                System.out.print(i);
            }
            if (i==5){
                i=0;
                System.out.println();
            }
        }
    }

}
