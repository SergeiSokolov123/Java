package practice.strings;

import java.util.Scanner;

public class FullNameFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
            int spaceCount = 0;
            String name = input;
            for (int i = 0; i < input.length(); i++) {
                if (name.charAt(i) == ' ') {
                    spaceCount++;

                }
            }
            for (int i = 0; i < input.length(); i++) {
                if (name.charAt(i) >= '0' && name.charAt(i) < '9' || spaceCount > 2 || spaceCount == 0) {
                    System.out.println("Введенная строка не является ФИО");
                    break;
                } else {
                    System.out.println("Фамилия: " + name.substring(0, name.indexOf(' ')) + System.lineSeparator()
                            + "Имя:" + name.substring(name.indexOf(' '), name.lastIndexOf(' ')) + System.lineSeparator()
                            + "Отчество:" + name.substring(name.lastIndexOf(' ')));
                    break;
                }


            }
        }
    }
}




