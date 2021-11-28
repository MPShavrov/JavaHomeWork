package com.pb.shavrov.hw10;

import com.pb.shavrov.hw10.exception.FullArr;

import java.util.Arrays;
import java.util.SortedMap;

public class NumBox<T extends Number> {
    private final T[] arr;

    public NumBox(int leng) {
        this.arr = (T[]) new Number[leng];
    }

    public void add(T num) throws FullArr {
        boolean full = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = num;
                full = false;
                break;
            }
        }
        if (full) {
            throw new FullArr("Массив переполнен");
        }

    }

    public T get(int index) {
        T a = null;
        try {
            a = arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return a;
    }

    public int length() {
        int len = 0;

        for (T i : arr) {
            if (i != null) {
                len += 1;
            }
        }

        return len;
    }

    public double average() {
        return sum() / length();
    }

    public double sum() {
        double sum = 0;

        for (T i : arr) {
            if (i != null) {
                sum += i.doubleValue();
            }
        }

        return sum;
    }


    @Override
    public String toString() {
        return "NumBox{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public T max() {
        T[] arr1 = Arrays.copyOf(arr, length());
        Arrays.sort(arr1);
        return arr1[arr1.length - 1];
    }
}