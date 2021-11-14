package com.pb.shavrov.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(String color, SizeC sizw, int price) {
        super(color, sizw, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболку одевают мужчины");
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболку одевают мужчины");
    }


}
