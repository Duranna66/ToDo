package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean completed;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public ToDoEntity(Long id, String title, boolean completed, UserEntity user) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.user = user;
    }

    public ToDoEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
