package JK;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Tester {
    public static void main(String args[]) {
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
////List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        Stream<String> stream = strings.stream();
//        Stream<String> stringStream = stream.filter(string -> !string.isEmpty());
//        List<String> collect = stringStream.collect(Collectors.toList());
//        System.out.println(stream);
//        System.out.println(stringStream);
//        System.out.println(collect);
//        Random random = new Random();
//        random.ints().limit(6).forEach(System.out::println);
//        Random random = new Random();
//        random.ints().limit(10).sorted().forEach(System.out::println);


//        List<? extends Number> list = Arrays.asList(1.1, 2, 3, 2);
//        System.out.println(list.toString());


//        List<String> s = Arrays.asList("qwqw", "aaa", "sss", "sss", "ddd");
//        boolean zzz = false;
//        try {
//            zzz = s.add("zzz");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(zzz);
//        System.out.println(s.toString());
//        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);
//        IntStream ints = random.ints();
//        IntStream limit = ints.limit(2);
//
//        System.out.println("======================");
//        limit.forEach(System.out::println);
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//// 获取对应的平方数
//        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
//
//        boolean add = squaresList.add(11);
//        squaresList.forEach(System.out::println);
//        Stream<Integer> stream = numbers.stream();
//        Stream<Integer> integerStream = stream.map(a -> a + a);
//        //Stream<Integer> distinct = integerStream.distinct();
//        List<Integer> collect = integerStream.collect(Collectors.toList());
//        System.out.println(collect.toString());

//        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//// 获取空字符串的数量
//        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
//        Stream<String> sorted = strings.stream().filter(string -> !string.isEmpty()).sorted();
//        sorted.forEach(System.out::println);
//        System.out.println(count);

        Stream<List<Integer>> inputStream = Stream.of(Arrays.asList(1),
                Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        Stream<Integer> outputStream = inputStream.flatMap((childList) -> childList.stream());
        outputStream.forEach(System.out::println);



    }
}
