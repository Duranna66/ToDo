package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.exception.UserAlreadyExist;
import com.example.demo.exception.UserIsNotFound;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public UserEntity reg(UserEntity user) throws UserAlreadyExist {
        if(userRepo.findByUserName(user.getUserName()) != null) {
            throw new UserAlreadyExist("пользователь с таким именем уже есть");
        }
        return userRepo.save(user);
    }
    public UserEntity getUser(Long id) throws UserIsNotFound {
        if(userRepo.findById(id).get().getUserName() == null) {
            throw new UserIsNotFound("Пользователь не найден");
        }
        return userRepo.findById(id).get();
    }
    public Long deleteUser(Long id) {
        userRepo.deleteById(id);
        return id;
    }
}
