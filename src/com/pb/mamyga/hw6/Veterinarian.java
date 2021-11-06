package com.pb.mamyga.hw6;

public class Veterinarian {
    String name;

    public Veterinarian(String name){
        this.name= name;
    }

    void treatAnimal(Animal animal){
        System.out.println("Прием ведет: " + name);
        System.out.println("Пациент: " + animal.name + ", любимое блюдо: " + animal.food + ", любимое место: " + animal.location);
    }
}
