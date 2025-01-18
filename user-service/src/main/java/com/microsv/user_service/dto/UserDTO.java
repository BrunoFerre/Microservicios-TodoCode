package com.microsv.user_service.dto;


import java.util.List;

public class UserDTO {
    private Long user_id;
    private String name;
    private String lastname;
    private String cellphone;
    private List<PostDTO> postList;

    public UserDTO() {
    }

    public UserDTO(Long user_id, String name, String lastname, String cellphone, List<PostDTO> postList) {
        this.user_id = user_id;
        this.name = name;
        this.lastname = lastname;
        this.cellphone = cellphone;
        this.postList = postList;
    }

    public Long getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public List<PostDTO> getPostList() {
        return postList;
    }
}
