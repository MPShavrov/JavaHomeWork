package com.pb.shavrov.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = 1 + (int) (Math.random() * 100);
        int a = 0;
        int count = 0;
        System.out.println("Угадайте число от 1 до 100");
        System.out.println("Для выхода из ИГРЫ введите QITE");
        while (a != b) {
            String str = scan.next();
            count++;

            if (str.equalsIgnoreCase("qite")) {
                System.out.println("Вы покинули игру");
                break;
            } else if(!str.matches("\\d+")){
                System.out.println("Введено не целое число. Попробуй еще.");
                continue;
            }

            a = Integer.parseInt(str);

            if (a <= 0 || a > 100) {
                System.out.println("Число не входит в диапазон, попробуйте еще");
            } else if (a < b) {
                System.out.println("Ваше число меньше искомого");
            } else if (b < a) {
                System.out.println("Ваше число больше искомого");
            } else {
                System.out.println("Вы угадали!!!");
                System.out.println("Вы угадали число с " + count + " попыток");
            }
        }

    }
}
