package com.microsv.post_service.service;

import com.microsv.post_service.model.Post;

import java.util.List;

public interface PostService {
    public List<Post> getPostsByUser(Long user_id);

}
