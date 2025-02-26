package com.example.demo.model;

public class Post {
    private final String text;
    private Integer likes;

    public Post(String text) {
        this.text = text;
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
}