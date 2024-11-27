package de.neuefische;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook(Book book) {
        int newLength = this.books.length + 1;
        this.books = Arrays.copyOf(this.books, newLength);
        this.books[newLength - 1] = book;
    }

    public void removeBook(Book book) {
        int newLength = books.length - 1;
        Book[] newlibrary = new Book[newLength];

        int counter = 0;
        for (Book value : this.books) {
            if (!value.equals(book)) {
                newlibrary[counter] = value;
                counter++;
            }
        }
        this.books = newlibrary;
    }
}
