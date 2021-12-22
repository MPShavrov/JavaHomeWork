package com.pb.shavrov.hw12;

import java.util.Date;
import java.util.List;

public class ContactNew implements Comparable<ContactNew> {
    private final String name;
    private String dateBirth;
    private List<String> phone;
    private String addres;
    private Date dateTime = new Date();

    public ContactNew(String name, String dateBirth, List<String> phones, String address) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.phone = phones;
        this.addres = address;
    }

    public String getName() {
        return name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public List<String> getPhone() {
        return phone;
    }

    public String getAddres() {
        return addres;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", DateBirth='" + dateBirth + '\'' +
                ", phone=" + phone +
                ", addres='" + addres + '\'' +
                ", DateTime='" + dateTime + '\'' +
                '}';
    }

    @Override
    public int compareTo(ContactNew o) {
        return 0;
    }
}
