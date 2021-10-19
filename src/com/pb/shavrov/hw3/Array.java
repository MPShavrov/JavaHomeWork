package com.pb.shavrov.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение " + (i + 1) + " элемента массива");
            int val = scan.nextInt();
            arr[i] = val;
        }
        System.out.println(Arrays.toString(arr));
        sumArr(arr);
        bubbleSorter(arr);
        numbeOfPositiveElementsOfTheArray(arr);
    }

    public static void sumArr(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма всех элементов массива = " + sum);
    }

    public static void bubbleSorter(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void numbeOfPositiveElementsOfTheArray(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i >= 0) {
                count++;
            }
        }
        System.out.println("Количество положительніх єлементов = " + count);
    }
}
