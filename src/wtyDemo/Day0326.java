package wtyDemo;

public class Day0326 {

    public static void main(String[] args) {

        int a = 110;
        int b = 113;
        int sum = SumPrime(a, b);

        System.out.println("素数之和为：" + sum);
    }
    private static int SumPrime(int a, int b) {
        int sum = 0;
        boolean flag = true;
        for (int i = a + 1; i < b; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                sum += i;
            }
        }
        return sum;
    }
}
