package JK;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class strem {
    public static void main(String[] args) {
//        List<String> stringqqq = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//
//        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        // 获取对应的平方数
//        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
//        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        // 获取空字符串的数量
//        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
//        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);
//        Random random = new Random();
//        random.ints().limit(10).sorted().forEach(System.out::println);
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//        // 获取空字符串的数量
//        int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();

//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        System.out.println("筛选列表: " + filtered);
//        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
//        System.out.println("合并字符串: " + mergedString);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());


    }
}
