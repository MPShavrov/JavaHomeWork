package com.pb.shavrov.hw6;

public class Cat extends Animal{
    public Cat(String food, String location, String nameAnimal) {
        super(food, location, nameAnimal);
    }

    public Cat() {
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("МЯУ");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" из мисочки");
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
