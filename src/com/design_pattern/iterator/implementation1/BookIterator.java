package com.design_pattern.iterator.implementation1;

import java.util.List;

public class BookIterator implements Iterator<Book> {

    private List<Book> books;

    private int currentIndex = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        if (currentIndex < books.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        Book book = books.get(currentIndex);
        currentIndex++;
        return book;
    }


}
