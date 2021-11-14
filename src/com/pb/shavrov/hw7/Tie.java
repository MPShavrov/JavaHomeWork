package com.pb.shavrov.hw7;

public class Tie extends Clothes implements ManClothes{
    public Tie(String color, SizeC sizw, int price) {
        super(color, sizw, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстуки одевают только мужчины");
    }


}
