package com.pb.shavrov.hw6;

public class Dog extends Animal{
    public Dog(String food, String location, String nameAnimal) {
        super(food, location, nameAnimal);
    }

    public Dog() {
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("ГАВ");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" из миски");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
