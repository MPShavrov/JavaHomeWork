package com.pb.shavrov.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String name;

    public Horse(String food, String location, String nameAnimal, String name) {
        super(food, location, nameAnimal);
        this.name = name;
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
        Horse horse = (Horse) obj;
        if (name != horse.name)
            return false;

        return name == this.name;
    }

    @Override
    public String toString() {
        return "Кличка " + name + " " + super.toString();
    }
}
