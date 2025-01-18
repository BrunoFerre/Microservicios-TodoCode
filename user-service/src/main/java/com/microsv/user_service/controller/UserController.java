package com.microsv.user_service.controller;

import com.microsv.user_service.dto.UserDTO;
import com.microsv.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/posts/{user_id}")
    public UserDTO getUserPosts(@PathVariable Long user_id) {
        UserDTO userDTO = userService.getUserAndPosts(user_id);
        return userDTO;
    }
}
