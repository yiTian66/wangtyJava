package wtyDemo;

public class Day1114 {

    public static void main(String[] args) {
//        String s = "aADfZz";
//        String s2 = next(s);
//        System.out.println(s2);
//


        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("Fred"));


    }

    private static String next(String s) {
        byte[] bytes = s.getBytes();
        byte[] bytes1 = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            bytes1[i] = (byte) (bytes[i] + 1);
        }
        return new String(bytes1);
    }

}
