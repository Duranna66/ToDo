package com.example.demo.model;

import com.example.demo.entity.ToDoEntity;

public class ToDo {
    private Long id;
    private boolean completed;
    private String title;
    public static ToDo toModel(ToDoEntity toDo) {
        ToDo toDo1 = new ToDo();
        toDo1.setId(toDo.getId());
        toDo1.setTitle(toDo.getTitle());
        toDo1.setCompleted(toDo.getCompleted());
        return toDo1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ToDo() {
    }
}
