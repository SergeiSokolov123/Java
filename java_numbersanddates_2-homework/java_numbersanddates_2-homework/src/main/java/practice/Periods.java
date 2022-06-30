package practice;

import org.checkerframework.checker.units.qual.C;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Periods {
    public static void main(String[] args) {

        LocalDate secondDate =LocalDate.of(1995,5,23);
        LocalDate firstDate = LocalDate.now();
        System.out.println(getPeriodFromBirthday(firstDate,secondDate));
    }

    // реализуйте вывод разницы между датами, используя класс Period
    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate){
            Period period = Period.between(secondDate, firstDate);
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(Locale.ENGLISH);
        System.out.println(secondDate);
        System.out.println(firstDate);
        System.out.println("Years:" + period.getYears() +
                " months:" + period.getMonths() +
                " days:"+period.getDays());

        return "";

    }

}
