package com.pb.shavrov.hw7;

abstract class Clothes {
    private String color;
    private int sizw;
    private int price;

    public Clothes() {
    }

    public Clothes(String color, int sizw, int price) {
        this.color = color;
        this.sizw = sizw;
        this.price = price;
    }
}
