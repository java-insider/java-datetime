package commonuses;

import java.time.DayOfWeek;

public class DayOfWeekApp {

    public static void main(String[] args) {

        DayOfWeek dow1 = DayOfWeek.MONDAY;
        System.out.println(dow1);
        System.out.println(dow1.getValue());

        DayOfWeek dow2 = DayOfWeek.of(6);
        System.out.println(dow2);

        DayOfWeek dow3 = dow2.plus(2);
        System.out.println(dow3);
    }
}
