package com.alt.Book.model;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
    @Id
    private String title;
    private String author;
    private long ISBN;

    public Book(String title, String author, long ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
}
