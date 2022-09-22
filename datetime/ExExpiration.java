package datetime;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ExExpiration {

    public static void main(String[] args) {
        System.out.println(calculateExpirationTime(5));
    }

    private static long calculateExpirationTime(int hours) {
        return Instant.now().plus(hours, ChronoUnit.HOURS).getEpochSecond();
    }
}
