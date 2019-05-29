package wtyDemo;

import java.util.Scanner;

public class Day0831 {
    public static void main(String[] args) {
        System.out.println("请输入你的密码：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.print(c);
        }

    }
}
