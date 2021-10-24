package com.pb.mamyga.hw3;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        int s = 0;
        int c = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите "+(i+1)+"/10: ");
            array[i] = in.nextInt();
        }

        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            s += array[i];
            if(array[i] > 0){
                c++;
            }
        }

        System.out.println("");
        System.out.println("Сумма: " + s + ".");
        System.out.println("Количество положительных: " + c + ".");

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }

        System.out.print("Массив остортированный: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
