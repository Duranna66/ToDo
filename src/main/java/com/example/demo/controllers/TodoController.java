package com.example.demo.controllers;

import com.example.demo.entity.ToDoEntity;
import com.example.demo.service.TodoService;
import jakarta.persistence.PostUpdate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private TodoService todoService;
    @PostMapping
    public ResponseEntity<String> createToDo(@RequestBody ToDoEntity toDoEntity,
                                                    @RequestParam Long id) {
        todoService.registration(toDoEntity, id);
        return ResponseEntity.ok("ok");
    }
        @PutMapping
        public ResponseEntity<String> updateComplete(@RequestParam Long id) {
            todoService.complete(id);
            return ResponseEntity.ok("ko");
        }


}
