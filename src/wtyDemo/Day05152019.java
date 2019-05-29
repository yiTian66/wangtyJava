package wtyDemo;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Day05152019 {

    public static void main(String[] args) {
        Student1 s[] = new Student1[3];
        s[0] = new Student1("小王", "001", "男", 20.0, 2.5, 80.0, 5.0, 68.0, 4.5);
        s[1] = new Student1("小张", "002", "男", 50.0, 2.5, 60.0, 5.0, 78.0, 4.5);
        s[2] = new Student1("小李", "003", "男", 30.0, 2.5, 50.0, 5.0, 88.0, 4.5);
        Map<Double, Student1> map = new TreeMap();
        for (int i = 0; i < s.length; i++) {
            double v = s[i].getACredit() * s[i].getAScore() + s[i].getBCredit() * s[i].getBScore() + s[i].getCCredit() * s[i].getCScore();
            map.put(v, s[i]);
        }
        Iterator<Double> it = map.keySet().iterator();
        while (it.hasNext()) {
            Double next = it.next();
            System.out.println(next + " aaaaa " + map.get(next).toString());
        }

        Lock lock=new ReentrantLock();
        lock.lock();
        lock.unlock();
        
    }
}

class Student1 {
    //包括姓名、学号、性别，还分别保存三门课程的成绩及三门课程对应的学分
    private String name;
    private String id;
    private String sex;
    private Double AScore;
    private Double ACredit;
    private Double BScore;
    private Double BCredit;
    private Double CScore;
    private Double CCredit;

    public Student1(String name, String id, String sex, Double AScore, Double ACredit, Double BScore, Double BCredit, Double CScore, Double CCredit) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.AScore = AScore;
        this.ACredit = ACredit;
        this.BScore = BScore;
        this.BCredit = BCredit;
        this.CScore = CScore;
        this.CCredit = CCredit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getAScore() {
        return AScore;
    }

    public void setAScore(Double AScore) {
        this.AScore = AScore;
    }

    public Double getACredit() {
        return ACredit;
    }

    public void setACredit(Double ACredit) {
        this.ACredit = ACredit;
    }

    public Double getBScore() {
        return BScore;
    }

    public void setBScore(Double BScore) {
        this.BScore = BScore;
    }

    public Double getBCredit() {
        return BCredit;
    }

    public void setBCredit(Double BCredit) {
        this.BCredit = BCredit;
    }

    public Double getCScore() {
        return CScore;
    }

    public void setCScore(Double CScore) {
        this.CScore = CScore;
    }

    public Double getCCredit() {
        return CCredit;
    }

    public void setCCredit(Double CCredit) {
        this.CCredit = CCredit;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", AScore=" + AScore +
                ", ACredit=" + ACredit +
                ", BScore=" + BScore +
                ", BCredit=" + BCredit +
                ", CScore=" + CScore +
                ", CCredit=" + CCredit +
                '}';
    }
}