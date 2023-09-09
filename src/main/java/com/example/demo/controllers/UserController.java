package com.example.demo.controllers;

import com.example.demo.entity.UserEntity;
import com.example.demo.exception.UserIsNotFound;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public ResponseEntity<String> registration(@RequestBody UserEntity user) {
        try {
            userService.reg(user);
            return ResponseEntity.ok("User was saved");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("idite naxuy");
        }

    }
    @GetMapping("/")
    public User getUsers(@RequestParam Long id) throws UserIsNotFound {
        UserEntity user = userService.getUser(id);
        return User.toModel(user);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(userService.deleteUser(id) + " ");
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Not gooood");
        }
    }
}
