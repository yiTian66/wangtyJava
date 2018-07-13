package wtyDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Day0702 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    //获取字节码文件的三种方式
        Class c = Person.class;
        System.out.println("c: "+c);
        Person p = new Person();
        Class  c2 = p.getClass();
        System.out.println("c2: "+c2);
        Class c3 = Class.forName("wtyDemo.Person");
        System.out.println("c3: "+c3);
        System.out.println("=========================================");
        //获取所有构造方法
        Constructor[] cs = c.getConstructors();
        for (Constructor con: cs
             ) {
            System.out.println(con);
        }
        //获得指定构造方法
        Constructor con = c.getConstructor();
        System.out.println("空参构造方法："+con);
        Constructor con2 = c.getConstructor(String.class, String.class);
        System.out.println("满参构造方法+ "+con2);
        //执行构造方法，创建对象
        Object o = con.newInstance();
        System.out.println(o);
        Object o1 = con2.newInstance("柳岩", "38");
        System.out.println(o1);
        //获取成员方法
        Method[] ms = c.getMethods();
        for (Method m: ms
             ) {
            System.out.println(m);
        }

    }



}
