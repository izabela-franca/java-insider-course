package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateApp2 {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(1990,1,1);
        LocalDate date2 = date1.withYear(2000).withMonth(5);
        LocalDate date3 = date2.plusYears(4);
        LocalDate date4 = date3.minusDays(5);
       // LocalDate date4 = date3.minus(5, ChronoUnit.DAYS);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
    }
}
