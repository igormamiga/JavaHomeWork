package com.pb.mamyga.hw4;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.print("Введите строку 1: ");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();

        System.out.print("Введите строку 2: ");
        String str2 = in.nextLine();

        System.out.println("Результат isAnagram: " + (isAnagram(str1, str2) ? "YES" : "NO"));
    }

    static String prepareStr(String str){
        return str.trim().replaceAll("[,.!?—]", "").replaceAll(" +", " ").toLowerCase(Locale.ROOT);
    }

    static boolean isAnagram(String str1, String str2) {
        String s1 = prepareStr(str1);
        String s2 = prepareStr(str2);

        if (s1.equals(s2)){
            return false;
        }

        String [] arr1 = s1.split(" ");
        String [] arr2 = s2.split(" ");

        if(arr1.length != arr2.length) {
            return false;
        }

        int i = 0;

        while (i < arr1.length){
            if(arr1[i].length() != arr2[i].length()){
                return false;
            }

            char[] c1 = arr1[i].toCharArray();
            for (char c: c1){
                if(!arr2[i].contains(""+c)){
                    return false;
                }
            }

            i++;
        }

        return true;
    }
}
