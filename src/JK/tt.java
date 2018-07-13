package JK;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class tt {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);
        LocalDate localDate = now1.withYear(2016);
        boolean leapYear = now1.isLeapYear();
        System.out.println(leapYear);
        System.out.println(localDate.isLeapYear());

    }


}
