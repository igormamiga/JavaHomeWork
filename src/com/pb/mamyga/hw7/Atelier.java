package com.pb.mamyga.hw7;

public class Atelier {
    public static void main(String[] args){
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Tshirt(Size.XS, 5.25, "red");
        clothes[1] = new Pants(Size.L, 12.30, "orange");
        clothes[2] = new Skirt(Size.XXS, 4.5, "black");
        clothes[3] = new Tie(Size.M, 1.8, "yellow");

        dressMan(clothes);
        dressWoman(clothes);
    }

    static void dressMan(Clothes[] clothes){
        System.out.println("--- dressMan ---");
        for(Clothes c: clothes){
            if (c instanceof ManClothes) {
                System.out.println(((ManClothes) c).dressMan());
            }
        }
    }

    static void dressWoman(Clothes[] clothes){
        System.out.println("--- dressWoman ---");
        for(Clothes c: clothes){
            if (c instanceof WomanClothes) {
                System.out.println(((WomanClothes) c).dressWoman());
            }
        }
    }

    public enum Size {
        XXS("детский", 32),
        XS("взрослый", 34),
        S("взрослый", 36),
        M("взрослый", 38),
        L("взрослый", 40);

        String description;
        int euroSize;

        Size(String description, int euroSize) {
            this.description = description;
            this.euroSize = euroSize;
        }

        String getDescription(){
            return this.description;
        }

        int getEuroSize(){
            return this.euroSize;
        }
    }

    public static abstract class Clothes {
        Size size;
        double price;
        String color;
        String name;

        public Clothes(Size size, double price, String color, String name) {
            this.size = size;
            this.price = price;
            this.color = color;
            this.name = name;
        }

        public Size getSize() {
            return size;
        }

        public double getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        public String getName() {
            return name;
        }

    }

    public interface ManClothes {
        String dressMan();
    }

    public interface WomanClothes {
        String dressWoman();
    }

    public static class Tshirt extends Clothes implements ManClothes, WomanClothes {

        Tshirt(Size size, double price, String color) {
            super(size, price, color, "Футболка");
        }

        @Override
        public String dressMan() {
            return getName() + " —> размер: " + getSize() + "/" + getSize().getEuroSize()
                    + " (" +  getSize().getDescription() + ")"
                    + ", цвет: " + getColor()
                    + ", цена: $" + getPrice();
        }

        @Override
        public String dressWoman() {
            return getName() + " —> размер: " + getSize() + "/" + getSize().getEuroSize()
                    + " (" +  getSize().getDescription() + ")"
                    + ", цвет: " + getColor()
                    + ", цена: $" + getPrice();
        }
    }

    public static class Pants extends Clothes implements ManClothes, WomanClothes {
        Pants(Size size, double price, String color) {
            super(size, price, color, "Штаны");
        }

        @Override
        public String dressMan() {
            return getName() + " —> размер: " + getSize() + "/" + getSize().getEuroSize()
                    + " (" +  getSize().getDescription() + ")"
                    + ", цвет: " + getColor()
                    + ", цена: $" + getPrice();
        }

        @Override
        public String dressWoman() {
            return getName() + " —> размер: " + getSize() + "/" + getSize().getEuroSize()
                    + " (" +  getSize().getDescription() + ")"
                    + ", цвет: " + getColor()
                    + ", цена: $" + getPrice();
        }
    }

    public static class Skirt extends Clothes implements WomanClothes {
        Skirt(Size size, double price, String color) {
            super(size, price, color, "Юбка");
        }

        @Override
        public String dressWoman() {
            return getName() + " —> размер: " + getSize() + "/" + getSize().getEuroSize()
                    + " (" +  getSize().getDescription() + ")"
                    + ", цвет: " + getColor()
                    + ", цена: $" + getPrice();
        }

    }

    public static class Tie extends Clothes implements ManClothes {
        Tie(Size size, double price, String color) {
            super(size, price, color, "Галстук");
        }

        @Override
        public String dressMan() {
            return getName() + " —> размер: " + getSize() + "/" + getSize().getEuroSize()
                    + " (" +  getSize().getDescription() + ")"
                    + ", цвет: " + getColor()
                    + ", цена: $" + getPrice();
        }
    }
}
