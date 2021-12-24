package CalcAge;

import java.time.*;

public class CalcAge {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bDay = LocalDate.of(2002, Month.FEBRUARY, 13);
        int years = Period.between(bDay, today).getYears();
        System.out.println(years);
    }
}
