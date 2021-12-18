package com.pb.shavrov.hw11;

import java.util.Date;
import java.util.List;

public class Contact implements Comparable<Contact> {
    private final String name;
    private String dateBirth;
    private List<String> phone;
    private String addres;
    private Date dateTime = new Date();

    public Contact(String name, String DOB, List<String> phones, String address) {
        this.name = name;
        this.dateBirth = DOB;
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

    public void setDOB(String DOB) {
        this.dateBirth = DOB;
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
    public int compareTo(Contact o) {
        return 0;
    }
}
