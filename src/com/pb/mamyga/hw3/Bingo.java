package com.pb.mamyga.hw3;

import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 100.");
        System.out.println("Для выхода из программы введите - exit.");

        Random random = new Random();
        int y = random.nextInt(101);

        int x;
        int attempt = 0;

        //System.out.println("rand x: " + y);

        Scanner in = new Scanner(System.in);

        while (true) {
            attempt++;
            System.out.print("Введите число: ");
            String value = in.next();


            if (value.equals("exit")) {
                break;
            }

            x = Integer.parseInt(value);


            if(x < 0 || x > 100) {
                System.out.println("Число не в диапозоне от 0 до 100.");
                continue;
            }

            if (x != y){
                System.out.println("Число должно быть " + (x > y ? "меньше" : "больше" ) + ".");
                continue;
            }


            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }

        System.out.println("Конец игры!");

    }
}
