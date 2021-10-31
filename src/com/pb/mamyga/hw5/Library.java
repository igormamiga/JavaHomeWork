package com.pb.mamyga.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Приключения", "Иванов И. И.", 2000);
        books[1] = new Book("Словарь", "Сидоров А. В.", 1980);
        books[2] = new Book("Энциклопедия", "Гусев К. В.", 2010);

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В. В.");
        readers[1] = new Reader("Гагарин Ю. А.");
        readers[2] = new Reader("Крупский К. И.");


        System.out.println("Bсе книги: ");
        System.out.println("----------");
        for(Book b: books) {
            System.out.println(b.getName() + " (" + b.getAuthor() + " " + b.getYear() + ")");
        }


        System.out.println("");
        System.out.println("Bсе читатели: ");
        System.out.println("-------------");
        for(Reader r: readers) {
            System.out.println(r.getName());
        }


        System.out.println("");
        System.out.println("takeBook #1: " + readers[0].takeBook(3));
        System.out.println("takeBook #2: " + readers[0].takeBook(new String[] { "Приключения", "Словарь", "Энциклопедия"}));
        System.out.println("takeBook #3: " + readers[0].takeBook(books));


        System.out.println("");
        System.out.println("returnBook #1: " + readers[0].returnBook(3));
        System.out.println("returnBook #2: " + readers[0].returnBook(new String[] { "Приключения", "Словарь", "Энциклопедия"}));
        System.out.println("returnBook #3: " + readers[0].returnBook(books));

    }
}
