package com.pb.shavrov.hw5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("Дюна", "Фрэнк Герберт", 1965);
        Book book2 = new Book("Метро 2034", "Дмитрий Глуховский", 2009);
        Book book3 = new Book("Я робот", "Айзек Азимов", 1950);
        Book book4 = new Book("Дневник Джулиуса Родмэна", "Эдгар Аллан По", 1840);
        Book book5 = new Book("Рождение Стальной Крысы", "Гарри Гаррисон", 1985);

        Reader reader = new Reader();

        Reader reader1 = new Reader("Петров В.В.", 123456, "Физики", "2000-10-10", "09911111111");
        Reader reader2 = new Reader("Сидоров А.Е.", 222222, "Матиматики", "2000-12-30", "09911111112");
        Reader reader3 = new Reader("Воронин А.А.", 555555, "Биологии", "2000-09-22", "09911111113");

        Book.allBook(book1, book2, book3, book4, book5);
        System.out.println("********************************************************************");
        Reader.allReader(reader1, reader2, reader3);
        System.out.println("********************************************************************");
        reader.takeBook(reader1.getFullName(), 3);
        reader.takeBook(reader2.getFullName(), book1.getTitle(), book2.getTitle(), book3.getTitle());
        reader.takeBook(reader3.getFullName(), book1, book2, book3, book4);
        System.out.println("*******************************************************************");
        reader.returnBook(reader1.getFullName(), 3);
        reader.returnBook(reader2.getFullName(), book1.getTitle(), book2.getTitle(), book3.getTitle());
        reader.returnBook(reader3.getFullName(), book1.toString(), book2.toString(), book3.toString(), book4.toString());
    }
}
