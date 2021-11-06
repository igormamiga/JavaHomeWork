package com.pb.mamyga.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Кот Васька", "мыши", "чулан", true);
        animals[1] = new Dog("Пес Шарик", "котлеты", "будка", "Мячь");
        animals[2] = new Horse("Лошадь Машка", "яблоки", "конюшня", "Cерая");

        Class vetClazz = Veterinarian.class;//Class.forName("Veterinarian");
        Constructor constr = vetClazz.getConstructor(new Class[] {String.class});
        Object obj = constr.newInstance("Добрый доктор Айболит");

        if (obj instanceof Veterinarian) {
            for(Animal a: animals){
                System.out.println("---");
                ((Veterinarian) obj).treatAnimal(a);
            }
        }
    }
}