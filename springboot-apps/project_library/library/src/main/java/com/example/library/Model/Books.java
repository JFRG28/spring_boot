package com.example.library.Model;

import java.time.LocalDate;

public class Books {
    private long id;
    private String title;
    private String author;
    private LocalDate publishedDate;

    public Books(long id, String title, String author, LocalDate publishedDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    

}
