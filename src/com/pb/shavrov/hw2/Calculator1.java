package com.pb.shavrov.hw2;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите действие (/, *, +, -)");
        String sign = scan.next();
        System.out.println("Введите 2 числа");
        if (scan.hasNextInt()) {
            operand1 = scan.nextInt();
        }
        if (scan.hasNextInt()) {
            operand2 = scan.nextInt();
            calc(sign, operand1, operand2);
        } else {
            System.out.println("Извините, но это явно не целое число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void calc(String sign, int operand1, int operand2) {
        double val;
        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("На 0 делит нельзя");
                } else {
                    System.out.println((double) operand1 / operand2);
                }
                break;
            default:
                System.out.println("Извините, но такого действия нет. Перезапустите программу и попробуйте снова!");
        }
    }
}
