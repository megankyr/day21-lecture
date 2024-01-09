package com.ssf.day21lecture.model;

public class Book {
    private String bookId;
    private String title;
    private String authors;
    private String description;
    private float rating;
    private String image_url;
    private int pages;
    public Book() {
    }
    public Book(String bookId, String title, String authors, String description, float rating, String image_url,
            int pages) {
        this.bookId = bookId;
        this.title = title;
        this.authors = authors;
        this.description = description;
        this.rating = rating;
        this.image_url = image_url;
        this.pages = pages;
    }
    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthors() {
        return authors;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public String getImage_url() {
        return image_url;
    }
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
}
