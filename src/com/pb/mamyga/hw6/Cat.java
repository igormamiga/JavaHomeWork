package com.pb.mamyga.hw6;

import java.util.Objects;

public class Cat extends Animal {

    boolean likeMilk;

    Cat(String name, String food, String location, boolean likeMilk){
        super(name, food, location);
        this.likeMilk = likeMilk;
    }

    @Override
    void makeNoise() {
        System.out.println(name + " говорит Мяу!");
    }

    @Override
    void eat() {
        System.out.println(name + " есть " + food + " и молоко");
    }

    @Override
    void sleep(){
        System.out.println(name + " спит много!");
    }

   // @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return likeMilk == cat.likeMilk && name.equalsIgnoreCase(cat.name) &&
                location.equalsIgnoreCase(cat.location) && food.equalsIgnoreCase(cat.food);
    }

    //@Override
    public int hashCode() {
       return Objects.hash(name, likeMilk);
    }

    //@Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location=" + location + '\'' +
                ", likeMilk=" + likeMilk +
                '}';
    }

}
