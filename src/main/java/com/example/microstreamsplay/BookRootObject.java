package com.example.microstreamsplay;

import java.util.ArrayList;
import java.util.List;

public class BookRootObject {
    private final List<Book> books;

    public BookRootObject() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void addBook(final Book book) {
        this.books.add(book);
    }
}
