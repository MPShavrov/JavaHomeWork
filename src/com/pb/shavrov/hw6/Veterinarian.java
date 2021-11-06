package com.pb.shavrov.hw6;

public class Veterinarian {
    void treatAnimal(Animal... animal) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < animal.length; i++) {
            if (i == (animal.length - 1)) {
                builder.append(animal[i]);
            } else
                builder.append(animal[i] + "\n");
        }
        System.out.println("На приеме: \n" + builder);
    }
}
