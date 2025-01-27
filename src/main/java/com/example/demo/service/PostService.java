package com.example.demo.service;


import com.example.demo.model.Post;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Пост 1!!!"));
        posts.add(new Post("Пост 2!!!"));
        posts.add(new Post("Пост 3!!!"));

        return posts;
    }
}
