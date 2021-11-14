package com.pb.shavrov.hw7;

public class Skirt extends Clothes implements WomenClothes{
    @Override
    public void dressWomen() {
        System.out.println("Юбки одевают только женщины");
    }
}
