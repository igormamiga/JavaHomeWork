package com.pb.mamyga.hw10;

public class Main {
    public static void main(String[] args) throws Exception {
        NumBox<Integer> arrInt = new NumBox<>(4);
        arrInt.add(8);
        arrInt.add(10);
        arrInt.add(12);
        arrInt.add(17);

        System.out.println("--- Int ---");
        printRes(arrInt);


        NumBox<Float> arrFloat = new NumBox<>(4);
        arrFloat.add(2.56f);
        arrFloat.add(8.21f);
        arrFloat.add(1.2f);
        arrFloat.add(12.7f);

        System.out.println("--- Float ---");
        printRes(arrFloat);
    }

    static void printRes(NumBox arr){
        System.out.println("get(3): " + arr.get(3));
        System.out.println("length(): " + arr.length());
        System.out.println("average(): " + arr.average());
        System.out.println("sum(): " + arr.sum());
        System.out.println("max(): " + arr.sum());

    }
}
