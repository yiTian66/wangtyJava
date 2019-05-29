package wtyDemo;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Day0115 {

    @Test
    public void P() throws InterruptedException {
        HashMap<String, String> map = new HashMap<>();
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        Object o = new Object();

        Thread.sleep(111);
        map.put(null, "a");
        map.put("s", null);
        new String();




        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entrie : entries
                ) {
            System.out.println(entrie.getKey() + "...." + entrie.getValue());
        }


        System.out.println("Test");
        f();
    }

    @Before
    public void b() {
        System.out.println("Before");
    }

    @BeforeClass
    public static void c() {
        System.out.println("BeforeClass");
    }

    @BeforeClass
    public static void cc() {
        System.out.println("BeforeClasscc");
    }

    @After
    public void d() {
        System.out.println("After");
    }

    @AfterClass
    public static void e() {
        System.out.println("AfterClass");
    }


    public void f() {

        System.out.println("fffffff");

    }


}
