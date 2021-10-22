package com.pb.shavrov.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите первую строку");
//        String str1 = scan.next();
//        System.out.println("Введите вторую строку");
//        String str2 = scan.next();
        String str1 = "Аз есмь строка, живу я, мерой остр.";
        String str2 = "За семь морей ростка я вижу рост.";

        System.out.println("Является строки анаграммой?");
        isAnagram(str1, str2);
    }

    public static char[] stringIntoArray(String st) {
        char[] arr = st.replaceAll("[., ]", "").toLowerCase().toCharArray();
        Arrays.sort(arr);
        return arr;
    }

    public static void isAnagram(String str1, String str2) {
        System.out.println(Arrays.equals(stringIntoArray(str1), stringIntoArray(str2)) ? "Да" : "Нет");
    }
}
