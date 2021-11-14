package com.pb.shavrov.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes{

    @Override
    public void dressMan() {
        System.out.println("Штаны одевают мужчины");
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны одевают мужчины");
    }
}
