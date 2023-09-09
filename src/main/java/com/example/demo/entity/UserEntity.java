package com.example.demo.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String userName;
private String password;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
private List<ToDoEntity> userEntityList;

    public UserEntity(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public UserEntity() {

    }

    public List<ToDoEntity> getUserEntityList() {
        return userEntityList;
    }

    public void setUserEntityList(List<ToDoEntity> userEntityList) {
        this.userEntityList = userEntityList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

