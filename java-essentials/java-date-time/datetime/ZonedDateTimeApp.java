package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeApp {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2000, 2, 10, 12, 0, 0);

        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.systemDefault());
        System.out.println(zdt1);

        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("Europe/Lisbon"));
        System.out.println(zdt2);

        //Some Zone Ids:
        System.out.println(ZoneId.getAvailableZoneIds());
    }
}
