package com.design_pattern.iterator.implementation1;

public interface BookCollection {

    void addBook(Book book);

    Iterator<Book> iterator();

}
