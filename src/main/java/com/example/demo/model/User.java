package com.example.demo.model;

import com.example.demo.entity.ToDoEntity;
import com.example.demo.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class User {
    private String userName;
    private Long id;
    private List<ToDo> list;
    public static User toModel(UserEntity userEntity) {
        User model = new User();
        model.setId(userEntity.getId());
        model.setUserName(userEntity.getUserName());
        model.setList(userEntity.getUserEntityList().stream().map(ToDo::toModel).collect(Collectors.toList()));
        return model;
    }

    public List<ToDo> getList() {
        return list;
    }

    public void setList(List<ToDo> list) {
        this.list = list;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
