package com.kodilla.advance;

public class Book {

    private String author;
    private String tittle;

    public  Book (String author,String title) {
        this.tittle=title;
        this.author=author;
    }

    public static void main(String[] args) {
        Book book = new Book(" Robert C. Martin ", " Clean Code ");
        System.out.println(book.author + book.tittle);

    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }
}
