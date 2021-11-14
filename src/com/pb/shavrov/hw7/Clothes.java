package com.pb.shavrov.hw7;

public abstract class Clothes {
    private String color;
    private SizeC sizw;
    private int price;

    public Clothes() {
    }

    public Clothes(String color, SizeC sizw, int price) {
        this.color = color;
        this.sizw = sizw;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "color='" + color + '\'' +
                ", sizw=" + sizw +
                ", price=" + price +
                '}';
    }
}
