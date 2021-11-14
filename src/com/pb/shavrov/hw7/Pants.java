package com.pb.shavrov.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes{

    public Pants(String color, SizeC sizw, int price) {
        super(color, sizw, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны одевают мужчины");
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны одевают мужчины");
    }


}
