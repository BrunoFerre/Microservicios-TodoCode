package com.microsv.post_service.service.impl;

import com.microsv.post_service.model.Post;
import com.microsv.post_service.repository.PostRepository;
import com.microsv.post_service.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getPostsByUser(Long user_id) {

        return postRepository.findAllPostByUserId(user_id);
    }
}
