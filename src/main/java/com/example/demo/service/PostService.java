package com.example.demo.service;


import com.example.demo.model.Post;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Пост 1!!!", Date.valueOf("2005-10-05")));
        posts.add(new Post("Пост 2!!!", Date.valueOf("2005-10-10")));
        posts.add(new Post("Пост 3!!!", Date.valueOf("2005-10-20")));

        return posts;
    }
}