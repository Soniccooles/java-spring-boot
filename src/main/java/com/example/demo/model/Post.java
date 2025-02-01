package com.example.demo.model;

import java.sql.Date;

public class Post {

    private String text;
    private Integer likes;
    private final Date creationDate;

    public Post(String text) {
        this.text = text;
        creationDate = null;
    }

    public Post (String text, Date date) {
        this.text = text;
        this.creationDate = date;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}