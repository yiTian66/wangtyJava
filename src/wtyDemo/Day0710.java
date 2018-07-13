package wtyDemo;

public class Day0710 {
    static String str2 = "Hello";

    public static void AppendString(String str) {
        str = str + "TaiKang";
        System.out.println(" 方法内部  " + str + "   ");

    }

    public static void main(String[] args) {

//        char[] c = {'F', 'a', 'f', 'h', 'A', 'g', 'k'};
//        sortArr(c);
        String str1 = "Hello";
        AppendString(str1);
        System.out.println(str1);
        AppendString(str2);
        System.out.println(str2);
        switch (str1) {
            case "ww":
                System.out.println("ssss");
                break;
            case "df":
                System.out.println("dbcuwcnw");
                break;
        }
    }


    /**
     * 排序一个数组[F,a,f,h,A,g,k] 要求输出[A,a,F,f,g,h,k]
     *
     * @param c
     */
    public static void sortArr(char[] c) {
        for (int i = 0; i < c.length; i++) {
            char min = c[i];
            for (int j = i; j < c.length; j++) {
                if (c[i] < min) {
                    min = c[i];
                }
            }
            c[i] = min;
        }


        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }


    }
}
