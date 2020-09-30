package com.kodilla.collections.adv.immutable.special.homework;



public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("Clean Code","Robert C. Martin");
        Book book2 = bookManager.createBook("Clean Code","Robert C. Martin");
        Book book3 = bookManager.createBook("Clean Code","Robert C. Martin2");

        System.out.println(book1 = book2);
        System.out.println(book1 = book3);
        System.out.println(book2 = book3);
    }

}
