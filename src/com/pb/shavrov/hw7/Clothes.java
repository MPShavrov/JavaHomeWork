package com.pb.shavrov.hw7;

public abstract class Clothes {
    private String color;
    private Size sizw;
    private int price;

    public Clothes() {
    }

    public Clothes(String color, Size sizw, int price) {
        this.color = color;
        this.sizw = sizw;
        this.price = price;
    }


}
