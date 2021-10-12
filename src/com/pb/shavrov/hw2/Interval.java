package com.pb.shavrov.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число от [0 - 100]");
        if (scan.hasNextInt()) {
            int val = scan.nextInt();
            interval(val);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void interval(int val) {
        if (val >= 0 && val < 15) {
            System.out.println("[0 -14]");
        } else if (val < 36) {
            System.out.println("[15 - 35]");
        } else if (val < 51) {
            System.out.println("[36 - 50]");
        } else if (val <= 100) {
            System.out.println("[51 - 100]");
        } else {
            System.out.println("Значение не входит в эти интервалы");
        }
    }
}
