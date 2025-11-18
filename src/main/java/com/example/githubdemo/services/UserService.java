package com.example.githubdemo.services;

import com.example.githubdemo.dtos.UserDto;
import com.example.githubdemo.entities.Users;
import com.example.githubdemo.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public final UserRepository repository;

    public UserService(UserRepository repo) {
        this.repository = repo;
    }
    public Users addUser(Users user) {
        return repository.save(user);
    }
}
