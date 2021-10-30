package com.pb.mamyga.hw4;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.print("Введите текст: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Результат: " + toCapitalLetter(str));
    }

    static String toCapitalLetter(String str) {
        String ret = "";

        String [] arr = str.split(" ");
        for (String s: arr){
            ret += Character.toUpperCase(s.charAt(0)) + s.substring(1) + " ";
        }

        return ret;
    }
}
