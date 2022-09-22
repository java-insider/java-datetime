package datetime;

import java.time.LocalDate;
import java.time.Period;

public class ExTimeSinceBirth {

    public static void main(String[] args) {

        var birthDate = LocalDate.of(1980, 6, 10);
        var today = LocalDate.now();
        var period = Period.between(birthDate, today);

        System.out.format(
            "O período é de %d anos, %d meses e %d dias",
            period.getYears(),
            period.getMonths(),
            period.getDays()
        );
    }
}
