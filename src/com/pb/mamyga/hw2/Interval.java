package com.pb.mamyga.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int x;
        String res="";
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        x = scan.nextInt();

        if(x >= 0 && x<= 14){
            res = "[0 - 14]";
        }
        else if(x > 14 && x<= 35){
            res = "[15 - 35]";
        }
        else if(x > 35 && x<= 50){
            res = "[36 - 50]";
        }
        else if(x > 50 && x<= 100){
            res = "[51 - 100]";
        }
        else {
            res = x > 100 ? "Число больше 100" : "Число меньше 0";
        }

        System.out.print(res);
    }
}