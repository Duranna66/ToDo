package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
     UserEntity findByUserName(String userName);
     Optional<UserEntity> findById(Long id);
     void deleteById(Long id);
}
