package com.pb.shavrov.hw7;

public class Atelier {
    public static void main(String[] args) {


        Clothes clothes[] = {};

        dressMan(clothes);
        dressWomen(clothes);
//******************************************************************************
        SizeC[] sizes = SizeC.values();
        System.out.println("Все размеры одежды: ");
        for (SizeC sizeC : sizes) {
            System.out.println(sizeC);
        }

        System.out.println(SizeC.XXS.getEuroSize());
        System.out.println(SizeC.XXS.getDescription());
    }

    public static String dressMan(Clothes[] clothes) {

        return null;
    }

    public static String dressWomen(Clothes[] clothes) {

        return null;
    }
}
