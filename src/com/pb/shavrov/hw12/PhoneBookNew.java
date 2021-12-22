package com.pb.shavrov.hw12;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PhoneBookNew {
    public static List<ContactNew> contact = new ArrayList<>();
    public static ObjectMapper mapper = new ObjectMapper();

    public static void addContactPhoneBook(Scanner scan) {
        System.out.println("Введите ФИО:");
        String name = scan.nextLine();
        System.out.println("Введите дату рождения:");
        String dateBirth = scan.nextLine();
        boolean myCase = true;
        List<String> phones = new ArrayList<>();
        while (myCase) {
            System.out.println("Введите телефон:");
            String phone = scan.nextLine();
            phones.add(phone);
            System.out.println("Выбирете:");
            System.out.println("1. Добавить еще один телефон.");
            System.out.println("2. Выйти.");
            String choice = scan.nextLine();
            if (Objects.equals(choice, "2")) {
                myCase = false;
            }
        }
        System.out.println("Введите адрес проживания:");
        String address = scan.nextLine();
        contact.add(new ContactNew(name, dateBirth, phones, address));
    }
    public static void delContactFromPhoneBook(Scanner scan) {
        System.out.println("Введите ФИО для удаления контакта :");
        String name = scan.nextLine();
        boolean myCase = contact.removeIf(item -> Objects.equals(item.getName(), name));
        if (myCase) {
            System.out.println("Контакт " + name + " удален.");
        } else {
            System.out.println("Контакт не найден!");
        }
    }

    public static void searchByPhoneBook(Scanner scan) {
        System.out.println("Введите имя для поиска:");
        String name = scan.nextLine();
        String searchContact = null;
        for (ContactNew item : contact) {
            if (Objects.equals(item.getName(), name)) {
                searchContact = item.toString();
                break;
            }
        }
        if (searchContact == null) {
            System.out.println("Контакт не найден");
        } else {
            System.out.println(searchContact);
        }
    }

    public static void sortByName(Scanner scan) {
        System.out.println("До:");
        for (ContactNew i : contact) {
            System.out.println(i);
        }
        contact.sort(Comparator.comparing(ContactNew::getName));
        System.out.println("После:");
        for (ContactNew i : contact) {
            System.out.println(i);
        }
    }

    public static void sortByDate(Scanner scan) {
        System.out.println("До:");
        for (ContactNew i : contact) {
            System.out.println(i);
        }
        contact.sort(Comparator.comparing(ContactNew::getDateTime));
        System.out.println("После:");
        for (ContactNew i : contact) {
            System.out.println(i);
        }
    }

    public static void editContact(Scanner scan) {
        System.out.println("Введите имя для редактирования:");
        String name = scan.nextLine();
        String field = "";
        while (!Objects.equals(field, "4")) {
            System.out.println("Какое поле редактировать:");
            System.out.println("1. Дата рождения.\n" +
                    "2. Телефон.\n" +
                    "3. Адрес.\n" +
                    "4. Выход.");
            field = scan.nextLine();
            switch (field) {
                case "1":
                    System.out.println("Введите новую дату рождения:");
                    String newDateBirth = scan.nextLine();
                    for (ContactNew item : contact) {
                        if (Objects.equals(item.getName(), name)) {
                            item.setDateBirth(newDateBirth);
                            break;
                        }
                    }
                    break;
                case "2":
                    boolean myCase = true;
                    List<String> phones = new ArrayList<>();

                    while (myCase) {
                        System.out.println("Введите телефон:");
                        String phone = scan.nextLine();
                        phones.add(phone);
                        System.out.println("Сделать выбор:\n " +
                                "1. Добавьте еще один телефон.\n " +
                                "2. Выход.");
                        String choice = scan.nextLine();
                        if (Objects.equals(choice, "2")) {
                            myCase = false;
                        }
                    }
                    for (ContactNew item : contact) {
                        if (Objects.equals(item.getName(), name)) {
                            item.setPhone(phones);
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("Введите новый адрес:");
                    String newAddress = scan.nextLine();
                    for (ContactNew item : contact) {
                        if (Objects.equals(item.getName(), name)) {
                            item.setAddres(newAddress);
                            break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("Пока.");
                    break;
                default:
                    System.out.println("Неправильный номер меню\n!");
            }
            Date date = new Date();
            for (ContactNew item : contact) {
                if (Objects.equals(item.getName(), name)) {
                    item.setDateTime(date);
                    break;
                }
            }
        }
    }

    public static void addToFile() throws IOException {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(contact);

        try (Writer writer = new FileWriter("src\\com\\pb\\shavrov\\hw12\\files\\json.txt")) {
            writer.write(json);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(json);
    }

    public static void loadFromFile() throws Exception {
        try {
            String json = new String(Files.readAllBytes(Paths.get("src\\com\\pb\\shavrov\\hw12\\files\\json.txt")), StandardCharsets.UTF_8);
            List<ContactNew> newContacts = mapper.readValue(json, List.class);
            System.out.println(newContacts.toString());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
