package com.example.demo.service;

import com.example.demo.model.Post;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();
    private Long nextId = 0L;

    {
        posts.add(new Post(nextId++, "Пост 1!!!", new Date(125,1,1)));
        posts.add(new Post(nextId++, "Пост 2!!!", new Date(125,3,5)));
        posts.add(new Post(nextId++, "Пост 3!!!", new Date(999,2,8)));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(nextId++, text, new Date()));
    }
}
