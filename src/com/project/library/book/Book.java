
package com.project.library.book;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getTitle(String title) {
        return title;
    }

    public void setAuthor() {
        this.author = author;
    }

    public String getAuthor(String author) {
        return author;
    }

    public void setIsbn() {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAvailable() {
        this.isAvailable = true;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public String toString(){
        return title + " "  + author + " " + isbn;
    }
}
