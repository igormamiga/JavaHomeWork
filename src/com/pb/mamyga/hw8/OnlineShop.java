package com.pb.mamyga.hw8;

import com.pb.mamyga.hw7.Atelier;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlineShop {
    public static void main(String[] args){
        Auth auth = new Auth();
        Scanner scan = new Scanner(System.in);

        System.out.println("--- регистрация на сайте ---");

        System.out.print("Введите логин: ");
        String l = scan.next();

        System.out.print("Введите пароль: ");
        String p1 = scan.next();

        System.out.print("Введите пароль еще раз: ");
        String p2 = scan.next();

        try {
            auth.signUp(l, p1, p2);
            System.out.println("Спасибо, регистрация прошла успешно");
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }


        System.out.println("--- вход на сайт ---");

        System.out.print("Введите логин: ");
        l = scan.next();

        System.out.print("Введите пароль: ");
        p1 = scan.next();


        try {
            auth.signIn(l, p1);
            System.out.println("Спасибо, успешный вход");
        }
        catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }

    }

    static class Auth {
        String login;
        String password;

        Pattern loginPattern = Pattern.compile("^(?=.*[a-zA-Z0-9]).{8,20}$");
        Pattern passwordPattern = Pattern.compile("^(?=.*[a-zA-Z0-9_]).{5,}$");

        void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

            if(!isLoginValid(login)){
                throw new WrongLoginException();
            }

            if(!isPasswordValid(password)){
                throw new WrongPasswordException();
            }

            if(!password.equals(confirmPassword)){
                throw new WrongPasswordException("Пароли не совпадают");
            }

            this.login = login;
            this.password = password;
        }

        void signIn(String login, String password) throws WrongLoginException {
            if(!this.login.equals(login) || !this.password.equals(password)){
                throw new WrongLoginException("Неверный Вход");
            }
        }

        boolean isLoginValid(String login) {
            Matcher matcher = loginPattern.matcher(login);
            return matcher.matches();
        }

        boolean isPasswordValid(String password) {
            Matcher matcher = passwordPattern.matcher(password);
            return matcher.matches();
        }

    }

    static class WrongLoginException extends Exception {

        public WrongLoginException() {
            super("Логин не совпадает с шаблоном");
        }

        public WrongLoginException(String mess) {
            super(mess);
        }
    }

    static class WrongPasswordException extends Exception {

        public WrongPasswordException() {
            super("Пароль не совпадает с шаблоном");
        }

        public WrongPasswordException(String mess) {
            super(mess);
        }
    }
}
