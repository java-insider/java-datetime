package legacy;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static java.time.ZoneOffset.UTC;

public class DateAndInstantApp {

    public static void main(String[] args) {

        Instant instant = LocalDateTime.of(2030, 10, 1, 10, 0, 0, 0).toInstant(UTC);
        System.out.println(instant);

        Date date = Date.from(instant);
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar);

        Instant instant2 = date.toInstant();
        System.out.println(instant2);
    }
}
