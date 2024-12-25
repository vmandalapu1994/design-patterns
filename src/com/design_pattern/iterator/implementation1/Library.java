package com.design_pattern.iterator.implementation1;

import java.util.ArrayList;
import java.util.List;

public class Library implements BookCollection {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Iterator<Book> iterator() {
        return new BookIterator(List.copyOf(books));
    }

}
