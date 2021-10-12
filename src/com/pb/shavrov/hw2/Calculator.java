package com.pb.shavrov.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double operand1 = 0;
        double operand2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите действие (/, *, +, -)");
        String sign = scan.next();
        System.out.println("Введите 2 числа");
        if (scan.hasNextDouble()) {
            operand1 = scan.nextDouble();
        }
        if (scan.hasNextDouble()) {
            operand2 = scan.nextDouble();
            calc(sign, operand1, operand2);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static void calc(String sign, double operand1, double operand2) {
        double val;
        switch (sign) {
            case "+":
                System.out.printf("%.2f", val = operand1 + operand2);
                break;
            case "-":
                System.out.printf("%.2f", val = operand1 - operand2);
                break;
            case "*":
                System.out.printf("%.2f", val = operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("На 0 делит нельзя");
                } else {
                    System.out.printf("%.2f", val = operand1 / operand2);
                }
                break;
            default:
                System.out.println("Извините, но такого действия нет. Перезапустите программу и попробуйте снова!");
        }
    }
}
