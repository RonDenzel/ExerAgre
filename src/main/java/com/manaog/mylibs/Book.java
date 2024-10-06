/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manaog.mylibs;

/**
 *
 * @author MPO407-24
 */
public class Book {
    private String author;
    private String title;
    private Date pubDate;
    private Publisher publisher;

    public Book(String author, String title, Date pubDate) {
        this.author = author;
        this.title = title;
        this.pubDate = pubDate;
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

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int checkBookAge() {
        int currYear = 2024;
        if (currYear - pubDate.getYear() >= 3) {
            return 0;
        } else {
            return 1;
        }
    }
}
