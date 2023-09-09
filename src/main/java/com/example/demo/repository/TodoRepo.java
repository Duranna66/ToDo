package com.example.demo.repository;

import com.example.demo.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TodoRepo extends CrudRepository<ToDoEntity, Long> {
    ToDoEntity save(ToDoEntity toDoEntity);

    @Override
    Optional<ToDoEntity> findById(Long aLong);
}
