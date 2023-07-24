package com.project.library.libraryinterface;

import com.project.library.book.Book;

public interface LibraryInterface {
    void addBook(Book book);
    void removeBook(Book book);
    void searchByTitle(String title);
    void searchByAuthor(String author);
    void searchByIsbn(String isbn);
    void issueBook(String title);
    void returnBook(Book book);
    void displayAvailableBooks();
    void displayAllBooks();
}
