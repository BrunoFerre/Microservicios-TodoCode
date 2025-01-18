package com.microsv.user_service.service;

import com.microsv.user_service.dto.UserDTO;

public interface UserService {
    public UserDTO getUserAndPosts(Long user_id);
}
