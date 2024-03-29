package commonuses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitApp {

    public static void main(String[] args) {
        var start = LocalDate.of(2022, 1, 1);
        var end  = LocalDate.of(2023, 1, 1);
        System.out.println(ChronoUnit.DAYS.between(start, end));
        System.out.println(ChronoUnit.MONTHS.between(start, end));

        var newTime = ChronoUnit.HOURS.addTo(LocalTime.of(12, 0,0 ), 3);
        System.out.println(newTime);
    }
}
