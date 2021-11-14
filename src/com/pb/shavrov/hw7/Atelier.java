package com.pb.shavrov.hw7;

import com.pb.shavrov.hw3.Array;

import java.util.Arrays;

import static com.pb.shavrov.hw7.Atelier.dressMan;

public class Atelier {
    public static void main(String[] args) {


        Clothes clothes[] = {};

        dressMan(clothes);
        dressWomen(clothes);
//******************************************************************************
        Size[] sizes = Size.values();
        System.out.println("Все размеры одежды: ");
        for(Size size : sizes){
            System.out.println(size);
        }
    }

    public static String dressMan(Clothes[] clothes) {

        return null;
    }

    public static String dressWomen(Clothes[] clothes) {

        return null;
    }
}
