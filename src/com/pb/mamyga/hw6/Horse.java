package com.pb.mamyga.hw6;

import java.util.Objects;

public class Horse extends Animal{

    String suit;

    Horse(String name, String food, String location, String suit){
        super(name, food, location);
        this.suit = suit;
    }

    @Override
    void makeNoise() {
        System.out.println(name + " говорит Пфф!");
    }

    @Override
    void eat() {
        System.out.println(name + " есть " + food + " и сахар");
    }

    @Override
    void sleep(){
        System.out.println(name + " спит моло!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return suit.equalsIgnoreCase(horse.suit) && name.equalsIgnoreCase(horse.name) &&
                location.equalsIgnoreCase(horse.location) && food.equalsIgnoreCase(horse.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, suit);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location=" + location + '\'' +
                ", suit=" + suit +
                '}';
    }
}
