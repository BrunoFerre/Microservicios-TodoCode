package com.microsv.post_service.controller;

import com.microsv.post_service.model.Post;
import com.microsv.post_service.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private PostService postService;

    @Value("${server.port}")
    private int serverPort;

    @GetMapping
    public String getPosts() {
      return "Hello from post service";
    }

    @GetMapping("/{user_id}")
    public List<Post> getPostsByUserId(@PathVariable("user_id") Long user_id) {
        System.out.println("--------------Estoy en el puerto: " + serverPort);
        return postService.getPostsByUser(user_id);
    }
}
