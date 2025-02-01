package com.example.demo.service;


import com.example.demo.model.Post;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Пост 1!!!", new Date(125,1,1)));
        posts.add(new Post("Пост 2!!!", new Date(125,3,5)));
        posts.add(new Post("Пост 3!!!", new Date(999,2,8)));

        return posts;
    }
}