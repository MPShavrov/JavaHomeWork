package com.pb.shavrov.hw6;

public class Horse extends Animal {
    public Horse(String food, String location, String nameAnimal) {
        super(food, location, nameAnimal);
    }

    public Horse() {
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("ИГОГО");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" из корыта");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
