package practice.regex;

import java.util.Scanner;

public class FullNameFormatterRegex {
    private static final String FULL_NAME = "([А-Я][а-я]\\s+)([A-Я][а-я]\\s+)([А-Я][а-я])";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
            if (input.matches(FULL_NAME)) {
                String[] fio = input.split("\\s+");
                System.out.println("Фамилия: " + fio[0]);
                System.out.println("Имя: " + fio[1]);
                System.out.println("Отчество: " + fio[2]);
            } else {
                System.out.println("Введенная строка не является ФИО");


            }
        }
    }
}