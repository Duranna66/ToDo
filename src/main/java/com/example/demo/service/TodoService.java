package com.example.demo.service;

import com.example.demo.entity.ToDoEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.model.ToDo;
import com.example.demo.repository.TodoRepo;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private TodoRepo todoRepo;
    public ToDo registration(ToDoEntity toDoEntity, Long userId) {
            UserEntity user = userRepo.findById(userId).get();
            toDoEntity.setUser(user);
            return ToDo.toModel(todoRepo.save(toDoEntity));
    }
    public ToDo complete(Long id) {
        ToDoEntity toDo =  todoRepo.findById(id).get();
        toDo.setCompleted(!toDo.getCompleted());
        return ToDo.toModel(todoRepo.save(toDo));
    }
}
