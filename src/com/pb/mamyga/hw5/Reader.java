package com.pb.mamyga.hw5;

import java.util.Date;

public class Reader {
    private int number;
    private int phone;
    private String name;
    private String faculty;
    private Date birthDate;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String takeBook(int amount) {
        return this.name + " взял " + amount + " книги.";
    }

    public String takeBook(String[] books) {
        if(books.length == 0) {
            return this.name + " взял 0 книг.";
        }

        String mess = this.name + " взял книги: ";
        for(String b: books) {
            mess += b + ", ";
        }

        return mess.substring(0, mess.length() - 2) + ".";
    }

    public String takeBook(Book[] books) {
        if(books.length == 0) {
            return this.name + " взял 0 книг.";
        }

        String mess = this.name + " взял книги: ";
        for(Book b: books) {
            mess += b.getName() + " (" + b.getAuthor() + " " + b.getYear() + "), ";
        }

        return mess.substring(0, mess.length() - 2) + ".";
    }

    public String returnBook(int amount) {
        return this.name + " вернул " + amount + " книги.";
    }

    public String returnBook(String[] books) {
        if(books.length == 0) {
            return this.name + " вернул 0 книг.";
        }

        String mess = this.name + " вернул книги: ";
        for(String b: books) {
            mess += b + ", ";
        }

        return mess.substring(0, mess.length() - 2) + ".";
    }

    public String returnBook(Book[] books) {
        if(books.length == 0) {
            return this.name + " вернул 0 книг.";
        }

        String mess = this.name + " вернул книги: ";
        for(Book b: books) {
            mess += b.getName() + " (" + b.getAuthor() + " " + b.getYear() + "), ";
        }

        return mess.substring(0, mess.length() - 2) + ".";
    }
}
