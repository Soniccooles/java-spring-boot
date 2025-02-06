package com.example.demo.service;

import com.example.demo.model.Post;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.stream.StreamSupport;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts() {
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

    public void create(final String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
