package datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeApp {

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(23, 10, 15);
        LocalTime time2 = LocalTime.now();
        LocalTime time3 = LocalTime.now().withSecond(0).withNano(0);
        LocalTime time4 = LocalTime.parse("00:00:00");
        LocalTime time5 = LocalTime.parse("13-30-20", DateTimeFormatter.ofPattern("HH-mm-ss"));

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(time5);
    }
}
