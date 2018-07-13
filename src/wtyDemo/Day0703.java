package wtyDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day0703 {

    static  int a;
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("wtyDemo.food");
        Object o = c.newInstance();
        Method setName = c.getMethod("setName", String.class);
        Object o1 = setName.invoke(o, "早餐");
        Method show = c.getMethod("show");
        show.invoke(o);
/////////////////////////////////////////////////////////////
        /**
         * 定义一个Person类，类中包含name和age属性，
         * 属性私有，只提供get方法和全部的构造方法
         * （空参，带age属性的，带name属性的，带age和name属性的）。
         * 要求用反射方式获得person类的所有构造并分别通过构造创建person对象
         */
        Class cPerson = Class.forName("wtyDemo.Person");
        Constructor person = cPerson.getConstructor();
        Object o2 = person.newInstance();
         Constructor person1 = cPerson.getConstructor(String.class);
        Object o3 = person1.newInstance("jack");
         Constructor person2 = cPerson.getConstructor(int.class);
        Object o4 = person2.newInstance(22);
        Constructor person3 = cPerson.getConstructor(String.class,int.class);
        Object o5 = person3.newInstance("rose",77);

        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);


        /////////////////////////////////////////////////////////////////////////
        //创建一个类teacher，teacher中有private的成员字段age，使用反射获取age，并且为age赋值


        Class cTeacher = Class.forName("wtyDemo.teacher");
        Field age = cTeacher.getDeclaredField("age");
        Object o6 = cTeacher.newInstance();
        age.setAccessible(true);
        age.set(o6,12);
        System.out.println(o6);
//////////////////////////////////////////////////////////////////////
        /**
         * 集合设置泛型后，可以向集合指定添加指定的
         * 泛型类型数据现要求，通过反射，
         * 为集合添加任意类型数据
         */
        List<String> list = new ArrayList<String>();
        Class clazz = list.getClass();

        Method add = clazz.getDeclaredMethod("add", Object.class);
        add.invoke(list,12);
        add.invoke(list,true);
        add.invoke(list,"你好啊啊");
        add.invoke(list,12.22);


        System.out.println(list.toString());
        ///////////////////////////////////////////
        //请通过反射，完成创建Stu对象，并且调用study方法
        Class StuClass = Class.forName("wtyDemo.Stu");
        Constructor constructor = StuClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o7 = constructor.newInstance();
        Method study = StuClass.getDeclaredMethod("study");
        study.setAccessible(true);
        study.invoke(o7);
        ///////////////////////////////////////////////////////////////////////////
        System.out.println("=================反射拓展题================");
        Person person4 = new Person();
        //反射获取对象包名和类名
        System.out.println(person4.getClass().getName());


        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("================================================");
        String s="b";
        if(s=="b"){
            System.out.println("123dsssssssssss");
        }
    }
}
