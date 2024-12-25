package com.design_pattern.iterator.implementation1;

public class IteratorClient {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("book1", "author1"));
        library.addBook(new Book("book2", "author2"));
        library.addBook(new Book("book3", "author3"));
        library.addBook(new Book("book4", "author4"));
        library.addBook(new Book("book5", "author5"));

        Iterator<Book> bookIterator = library.iterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }

    }


}
