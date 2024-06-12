package com.abdelqodous.qa1z0_829.q48;

public class Book {
    String author;
    String title;

    Book(String authorName, String title){
        this.author = authorName;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
