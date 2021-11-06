package com.pb.mamyga.hw6;

public class Animal {

    String name;
    String food;
    String location;

    Animal(String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;
    }

    void makeNoise() {
        System.out.println(name + " молчит");
    }

    void eat() {
        System.out.println(name + " есть " + food);
    }

    void sleep(){
        System.out.println(name + " спит!");
    }
}
