package com.pb.shavrov.hw7;

public class Tshirt extends Clothes implements ManClothes,WomenClothes{
    @Override
    public void dressMan() {
        System.out.println("Футболку одевают мужчины");
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболку одевают мужчины");
    }
}
