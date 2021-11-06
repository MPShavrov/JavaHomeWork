package com.pb.shavrov.hw6;

public class Animal {
    private String food;
    private String location;
    private String nameAnimal;

    public Animal() {
    }

    public Animal(String food, String location, String nameAnimal) {
        this.food = food;
        this.location = location;
        this.nameAnimal = nameAnimal;
    }

    public void makeNoise() {
        System.out.println(nameAnimal + " произносит звук");
    }

    public void eat() {
        System.out.print(nameAnimal + " кушает " + food);
    }

    public void sleep() {
        System.out.println(nameAnimal + " спит в " + location);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

