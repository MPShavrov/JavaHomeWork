package com.pb.shavrov.hw6;

import java.util.Objects;


public class Cat extends Animal{
    private String name;

    public Cat (String food, String location, String nameAnimal, String name) {
        super(food, location, nameAnimal);
        this.name = name;
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
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Cat cat = (Cat) obj;
        if (name != cat.name)
            return false;

        return name == this.name;
    }

    @Override
    public String toString() {
        return "Кличка " + name + " " + super.toString();
    }
}
