package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;
//metoda tworząca nowy obiekt jest w klasie Book, dlatego nie ma klasy BookManager
public class BookApplication {
    public static void main(String[] args) {
        Set <Book> newBook = new HashSet<>();
        newBook.add(new Book("Robert C. Martin","Clean Code"));
        newBook.add(new Book("Robert C. Martin","Clean Code"));
        newBook.add(new Book("J.K. Rowling","Harry Potter"));

        System.out.println(newBook.size());
        for (Book book: newBook)
            System.out.println(book);

    }
}
