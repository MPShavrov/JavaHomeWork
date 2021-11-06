package com.pb.shavrov.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Veterinarian veterinarian = new Veterinarian();

        Cat cat = new Cat("Вискас", "квартире", "Кот", "Мурка");
        Dog dog = new Dog("кость", "будке", "Собака", "Джек");
        Horse horse = new Horse("овес", "конюшне", "Лошадь", "Зорька");

        Animal[] animals = {cat, dog, horse};

        for (Animal o : animals){
            o.sleep();
            o.eat();
            o.makeNoise();
            System.out.println(" -------------------------------------- ");
        }

        Class clazz = Class.forName("com.pb.shavrov.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[]{});
        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian) {

            System.out.println("\nНа прием пришли животные: ");
            for (Object o : animals) {
                ((Veterinarian) obj).treatAnimal(o);
            }
        }
    }
}

