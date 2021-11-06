package com.pb.shavrov.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String name;

    public Dog(String food, String location, String nameAnimal, String name) {
        super(food, location, nameAnimal);
        this.name = name;
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
        Dog dog = (Dog) obj;
        if (name != dog.name)
            return false;

        return name == this.name;
    }

    @Override
    public String toString() {
        return "Кличка " + name + " " + super.toString();
    }
}
