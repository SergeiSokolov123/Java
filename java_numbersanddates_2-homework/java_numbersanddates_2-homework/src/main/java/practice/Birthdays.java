package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        String str = "";
        int i = 0;
        while (birthday.isBefore(today)|| birthday.equals(today)) {
            str = str + i + " - " + birthday.format(formatter) + System.lineSeparator();
            //long years = ChronoUnit.YEARS.between(birthday,today);
            System.lineSeparator();
            i++;
            birthday = birthday.plusYears(1);
        }
        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue

        return str;

    }
}
