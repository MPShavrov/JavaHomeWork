package com.pb.shavrov.hw10;

import com.pb.shavrov.hw10.exception.FullArr;

public class Main {
    public static void main(String[] args) throws FullArr {

        NumBox<Integer> arrInt = new NumBox<>(3);
        try {
            arrInt.add(1);
            arrInt.add(6);
            arrInt.add(3);
            arrInt.add(4);
        } catch (FullArr e) {
            e.printStackTrace();
        }

        System.out.println(arrInt.length());
        System.out.println(arrInt);
        System.out.println(arrInt.get(15));
        System.out.println(arrInt.average());
        System.out.println(arrInt.sum());
        System.out.println(arrInt.max());

        System.out.println("************************************************");

        NumBox<Float> arrFloat = new NumBox<>(6);
        try {
            arrFloat.add(1.5f);
            arrFloat.add(2f);
            arrFloat.add(3f);
            arrFloat.add(4f);
        } catch (FullArr e) {
            e.printStackTrace();
        }

        System.out.println(arrFloat.length());
        System.out.println(arrFloat);
        System.out.println(arrFloat.get(3));
        System.out.println(arrFloat.average());
        System.out.println(arrFloat.sum());
        System.out.println(arrFloat.max());


    }
}

