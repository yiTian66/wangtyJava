package JK;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8 {


    /**
     * 首先，该方法是将数组转化为list。有以下几点需要注意：
     　　（1）该方法不适用于基本数据类型（byte,short,int,long,float,double,boolean）
     　　（2）该方法将数组与列表链接起来，当更新其中之一时，另一个自动更新
     　　（3）不支持add和remove方法
     */
    @Test
    public void iterTest() {
        List<String> languages = Arrays.asList("java","scala","python");
        List<String> strings = new ArrayList<>();
        strings.add("java");
        strings.add("scala");
        strings.add("python");
        //before java8
        for(String each:languages) {
            System.out.println(each);
        }
        //after java8
        System.out.println("===================================");
        languages.forEach(x -> System.out.println(x));
        System.out.println("===================================");
        languages.forEach(System.out::println);
    }
}
