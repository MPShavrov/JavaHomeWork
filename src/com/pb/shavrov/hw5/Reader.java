package com.pb.shavrov.hw5;

import java.util.Arrays;
import java.util.Date;

public class Reader {
    private String fullName;
    private Integer numberLibraryCard;
    private String faculty;
    private String dateBirth;
    private String telephone;

    public Reader(String fullName, Integer numberLibraryCard, String faculty, String dateBirth, String telephone) {
        this.fullName = fullName;
        this.numberLibraryCard = numberLibraryCard;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.telephone = telephone;
    }

    public Reader(){}

    public static void allReader(Object... reader) {
        for (Object r : reader) {
            System.out.println(r);
        }
    }

    public void takeBook(String fullName, int count) {
        System.out.println(fullName + " взял " + count + " книги");
    }

    public void takeBook(String fullName, String ... book) {
        String str = String.join(", ", book);
        System.out.println(fullName + " взял книги: " + str);
    }

    public void takeBook(String fullName, Object ... book) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < book.length; i++) {
            if(i == (book.length - 1)){
                builder.append(book[i]);
            }else
            builder.append(book[i] + ", ");
        }
        System.out.println(fullName + " взял книги: " + builder);
    }

    public void returnBook(String fullName, int count) {
        System.out.println(fullName + " вернул " + count + " книги");
    }

    public void returnBook(String fullName, String ... book) {
        String str = String.join(", ", book);
        System.out.println(fullName + " вернул книги: " + str);
    }

    public void returnBook(String fullName, Object ... book) {
        System.out.println(fullName + " вернул книги: " );
    }


    public String getFullName() {
        return fullName;
    }

    public Integer getNumberLibraryCard() {
        return numberLibraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return  "ФИО '" + fullName + '\'' +
                ", номер читательского билета " + numberLibraryCard +
                ", факультет '" + faculty + '\'' +
                ", дата рождения '" + dateBirth + '\'' +
                ", телефон '" + telephone + '\'';
    }
}
