package wtyDemo;

public class Day1008 {
    public static void main(String[] args) {
       String s="a-bC-dEf-ghIj";
        String s1 = reverseOnlyLetters(s);
        System.out.println("反转前："+s);
        System.out.println("反转后："+s1);
        ListNode l = new ListNode(1);

    }

    public static  String reverseOnlyLetters(String S) {
    String Result="";
        StringBuilder sb = new StringBuilder(Result);
        for (int i = S.length()-1; i >=0 ; i--) {
            if (S.charAt(i)!='-'){
                sb.append(S.charAt(i));
            }else {
                StringBuilder insert = sb.insert(i, '-');

            }
        }

        return sb.toString();
    }
}
