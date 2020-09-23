package com.kodilla.collections.adv.immutable.special.homework;

public class BookOne {

    private String author;
    private String tittle;

    public  BookOne (String author,String title) {
        this.tittle=title;
        this.author=author;
    }

    public static void main(String[] args) {
        BookOne book = new BookOne(" Robert C. Martin ", " Clean Code ");
        System.out.println(book.author + book.tittle);

    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

}
