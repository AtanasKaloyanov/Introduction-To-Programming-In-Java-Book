package org.example.Tasks.P03Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book getBookByAuthor(String author) {
        Book result = null;
        for (Book book : this.books) {
            if (book.getAuthor().equals(author)) {
                result = book;
                break;
            }
        }
        return result;
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public String getBookInfo(Book book) {
        return book.toString();
    }


}
