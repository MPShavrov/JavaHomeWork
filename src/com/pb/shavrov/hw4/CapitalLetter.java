package com.pb.shavrov.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текс");
        String text = scan.next();

        System.out.println(firstUpperCase(text));
    }

    public static StringBuilder firstUpperCase(String s1) {
        StringBuilder s2 = new StringBuilder();

        s2.append(s1.substring(0, 1).toUpperCase());

        for (int i = 1; i < s1.length(); i++) {
            if (" ".equals(s1.substring(i - 1, i)))
                s2.append(s1.substring(i, i + 1).toUpperCase());
            else
                s2.append(s1.charAt(i));
        }
        return s2;
    }

}
