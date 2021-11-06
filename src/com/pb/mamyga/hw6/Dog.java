package com.pb.mamyga.hw6;

import java.util.Objects;

public class Dog extends Animal {

    String favoriteToy;

    Dog(String name, String food, String location, String favoriteToy){
        super(name, food, location);
        this.favoriteToy = favoriteToy;
    }

    @Override
    void makeNoise() {
        System.out.println(name + " говорит Гав!");
    }

    @Override
    void eat() {
        System.out.println(name + " есть " + food + " и кости");
    }

    @Override
    void sleep(){
        System.out.println(name + " спит много много!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return favoriteToy.equalsIgnoreCase(dog.favoriteToy) && name.equalsIgnoreCase(dog.name) &&
                location.equalsIgnoreCase(dog.location) && food.equalsIgnoreCase(dog.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, favoriteToy);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location=" + location + '\'' +
                ", favoriteToy=" + favoriteToy +
                '}';
    }
}
