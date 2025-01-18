package com.microsv.user_service.service.impl;

import com.microsv.user_service.dto.PostDTO;
import com.microsv.user_service.dto.UserDTO;
import com.microsv.user_service.model.User;
import com.microsv.user_service.repository.ApiPost;
import com.microsv.user_service.repository.UserRepository;
import com.microsv.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ApiPost apiPost;

    @Override
    public UserDTO getUserAndPosts(Long user_id) {
        //Datos de usuario
        User user = userRepository.findById(user_id).orElse(null);
        //posteos desde api posteos
        List<PostDTO> postList = apiPost.getPostsByUserId(user_id);
        //unificar desde userDTO
        UserDTO userdto = new UserDTO(user.getUser_id(), user.getName(), user.getLastname(), user.getCellphone(), postList);
        return userdto;
    }
}
