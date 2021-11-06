package com.pb.shavrov.hw6;

public class VetСlinic {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();

        Cat cat = new Cat("Вискас", "квартире", "Кот");
        Dog dog = new Dog("кость", "будке", "Собака");
        Horse horse = new Horse("овес", "конюшне", "Лошадь");

        cat.sleep();
        dog.sleep();
        horse.sleep();
        System.out.println("---------------------------------------------");
        cat.makeNoise();
        dog.makeNoise();
        horse.makeNoise();
        System.out.println("----------------------------------------------");
        cat.eat();
        dog.eat();
        horse.eat();
    }

    }

