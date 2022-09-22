package datetime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeApp {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2000, 3, 1, 15, 0);

        OffsetDateTime odt1 = OffsetDateTime.of(ldt, ZoneOffset.UTC);
        OffsetDateTime odt2 = odt1.withOffsetSameInstant(ZoneOffset.of("-03:00"));

        System.out.println(ldt);
        System.out.println(odt1);
        System.out.println(odt2);
        System.out.println(odt1.isEqual(odt2));
    }
}
