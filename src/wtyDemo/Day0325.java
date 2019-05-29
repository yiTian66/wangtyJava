package wtyDemo;

import java.util.HashMap;
import java.util.Scanner;

public class Day0325 {

    HashMap<String, String> map = new HashMap<String, String>();

    public static void main(String[] args) {
        Student[] stu = new Student[5];
        Scanner s = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("请输入第" + i + "个学生姓名：");
            System.out.printf("请输入第%d个学生的姓名\n", i);
            String nameIn = s.next();
            System.out.println("请输入第" + i + "个学生成绩：");
            String pointIn = s.next();
            Student student = new Student(nameIn, pointIn);
            stu[i - 1] = student;
        }
        System.out.println("学生信息：");
        for (int i = 0; i < 5; i++) {
            System.out.println(stu[i].getName() + "      " + stu[i].getPoint());
        }
    }
}
