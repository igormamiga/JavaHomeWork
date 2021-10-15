package com.pb.mamyga.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2;
        String sign, res = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        operand1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        operand2 = scan.nextInt();

        System.out.print("Введите действие (+, -, *, /): ");
        sign = scan.next();

        switch (sign) {
            case "+" :
                res = operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                break;
            case "-" :
                res = operand1 + " - " + operand2 + " = " + (operand1 - operand2);
                break;
            case "*" :
                res = operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                break;
            case "/" :
                res =  operand2 == 0 ? "Деление на ноль" : operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                break;
        }

        System.out.print(res);

    }
}