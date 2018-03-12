package dates;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class LocalDateTest {

    private static int counter = 0;

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        showLocalDate(now);

        LocalDate yesterday = now.minusMonths(1);
        showLocalDate(yesterday);
    }

    private static void showLocalDate(LocalDate now) {
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMonth().getDisplayName(TextStyle.FULL, Locale.CANADA));
        System.out.println(now.getYear());
        System.out.println("Number of days in month: " + now.lengthOfMonth());
        System.out.println("Starts on: " + now.withDayOfMonth(1).getDayOfWeek());
    }
}
