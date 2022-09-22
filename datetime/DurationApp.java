package datetime;

import java.time.Duration;
import java.time.LocalTime;

public class DurationApp {

    public static void main(String[] args) {

        Duration d1 = Duration.ofHours(3);
        Duration d2 = Duration.ofMinutes(60);

        LocalTime l1 = LocalTime.of(12, 0);
        LocalTime l2 = LocalTime.of(16, 0);

        Duration d3 = Duration.between(l1, l2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d2.toSeconds());
        System.out.println(d3);
        System.out.println(d3.toMinutes());
    }
}
