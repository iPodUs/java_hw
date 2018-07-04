package main.java;

import java.util.HashSet;
import java.util.Set;

public class Zoo {
    private Set<Animal> animals = new HashSet<>();

    public static void main(String[] args){
        Zoo zoo = new Zoo();

        Dog dog = new Dog("Дворняга", "Тобик");
        dog.setOrder("Хищные");
        dog.setGenus("Волки");
        dog.setWeight(15.7);
        dog.setSpeed(23.3);
        dog.setWaterfowl(false);

        Horse horse = new Horse("Арабский скакун");
        horse.setCoat_colors("Гнедая");

        Whale whale = new Whale("Белуха");
        whale.setLength(4);

        Dolphin dolphin = new Dolphin("Афалина");
        dolphin.setLength(2);

        zoo.animals.add(dog);
        zoo.animals.add(horse);
        zoo.animals.add(whale);
        zoo.animals.add(dolphin);
        zoo.animals.add(new KillerWhale("Косатка"));

        for(Animal animal : zoo.animals){
            System.out.println(animal.toString());
        }
    }
}
