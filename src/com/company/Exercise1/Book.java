package com.company.Exercise1;

public class Book {

    private int numberOfPages;
    private String genre;
    private double price;
    private String author;
    private String title;

    public Book(int numberOfPages, String genre, double price, String author, String title) {
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.price = price;
        this.author = author;
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}' + "\n";
    }
}
