package com.pb.shavrov.hw12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainNew {

    public static void main(String[] args) throws Exception {
         List<ContactNew> contact = new ArrayList<>();


        contact.add(new ContactNew("Den", "01.01.2001", Arrays.asList("111111111111"), "Гдето45у4а55"));
        contact.add(new ContactNew("Ben", "02.02.2002", Arrays.asList("222222222222", "333333333333"), "Гдето 44ыа4в5 ува45в4в5"));
        contact.add(new ContactNew("Max", "04.04.2004", Arrays.asList("444444444444"), "Гдето авв55в5вв55в"));
        contact.add(new ContactNew("Den", "01.01.2001", Arrays.asList("111111111111"), "Гдето45у4а55"));
        contact.add(new ContactNew("Rock", "02.02.2002", Arrays.asList("6666666666", "77777777777"), "Гдето 44ыа4в5 ува45в4в5"));
        contact.add(new ContactNew("Hor", "04.04.2004", Arrays.asList("999999999999999999"), "Гдето авв55в5вв55в"));

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Сделайте выбор:");
            System.out.println("1. Добавить контакт.");
            System.out.println("2. Удалить контакт.");
            System.out.println("3. Поиск контакта.");
            System.out.println("4. Сортировать по имени.");
            System.out.println("5. Сортировать по дате редактирования.");
            System.out.println("6. Изменить контакт.");
            System.out.println("7. Добавить в файл.");
            System.out.println("8. Загрузить из файла.");
            System.out.println("9. Показать телефонную книгу.");
            System.out.println("0. Выход.");

            String option = scan.nextLine();

            switch (option) {
                case "1":
                    PhoneBookNew.addContactPhoneBook(scan);
                    break;
                case "2":
                    PhoneBookNew.delContactFromPhoneBook(scan);
                    break;
                case "3":
                    PhoneBookNew.searchByPhoneBook(scan);
                    break;
                case "4":
                    PhoneBookNew.sortByName(scan);
                    break;
                case "5":
                    PhoneBookNew.sortByDate(scan);
                    break;
                case "6":
                    PhoneBookNew.editContact(scan);
                    break;
                case "7":
                    PhoneBookNew.addToFile();
                    break;
                case"8":
                    PhoneBookNew.loadFromFile();
                    break;
                case "9":
                    for(ContactNew i: contact) {
                        System.out.println(i);
                    }
                    break;
                case "0":
                    System.out.println("Пока!");
                    return;
                default:
                    System.out.println("Не верный номер меню!");
            }
        }
    }
}
