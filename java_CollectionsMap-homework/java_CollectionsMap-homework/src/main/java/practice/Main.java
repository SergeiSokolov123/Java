package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String input = scanner.nextLine();
            String name;
            String phone;
            if (input.equals("0")) {
                break;
            }
            if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
            } else if (phoneBook.checkName(input)) {
                name = input;
                if (phoneBook.getContactByName(name).isEmpty()) {
                    System.out.println("Такого имени в телефонной книге нет" + System.lineSeparator() +
                            "Введите номер телефона " + name + ":");
                    phone = scanner.nextLine();
                    if (phoneBook.checkPhone(phone)) {
                        phoneBook.addContact(phone, name);
                    }
                } else {
                    System.out.println(phoneBook.getContactByName(name));
                }
            } else if (phoneBook.checkPhone(input)) {
                phone = input;
                if (phoneBook.getContactByPhone(phone).isEmpty()) {
                    System.out.println("Такого телефона в телефонной книге нет" + System.lineSeparator() +
                            "Введите имя " + phone + ":");
                    name = scanner.nextLine();
                    if (phoneBook.checkName(name)) {
                        phoneBook.addContact(phone, name);
                    }
                }
            }
        }
    }
}