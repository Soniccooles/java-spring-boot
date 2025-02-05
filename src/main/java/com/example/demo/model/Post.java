package com.example.demo.model;

import java.util.Date;

public class Post {

    private String text;
    private Integer likes;
    private final Date creationDate;
    private Long id;

    public Post(Long id, String text, Date date) {
        this.id = id;
        this.text = text;
        this.creationDate = date;
        likes =0;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }
}
