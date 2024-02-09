package org.example.Tasks.P03Library;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private int year;
    private String isbn;

    public Book(String name, String author, String publisher, int year, String isbn) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return"Book's Info: " + "\n" +
                "Book's name: " + this.name + "\n" +
                "Book's author: " + this.author + "\n" +
                "Book's publisher: " + this.publisher + "\n" +
                "Book's year: " + this.year + "\n" +
                "Book's isbn: " + this.isbn;
    }
}
