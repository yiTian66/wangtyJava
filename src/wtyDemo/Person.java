package wtyDemo;

import java.util.Objects;

public class Person {


    static {
        System.out.println("静态代码块执行了。。。");
    }

    {
        System.out.println("普通代码块执行了。。。");
    }



    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person() {
        System.out.println("Person构造方法执行了。。。");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
