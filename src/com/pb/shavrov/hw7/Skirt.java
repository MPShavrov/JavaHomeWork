package com.pb.shavrov.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(String color, SizeC sizw, int price) {
        super(color, sizw, price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбки одевают только женщины");
    }


}
