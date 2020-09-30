package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {
    private final Map<Book, Book> booksMap = new HashMap<>();

    public Book createBook(String title, String author){
        Book book = new Book(author,title);
        if (booksMap.containsKey(book)){
            return booksMap.get(book);
        }
        booksMap.put(book, book);
        return book;
    }
}
