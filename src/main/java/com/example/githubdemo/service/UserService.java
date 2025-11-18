package com.example.githubdemo.service;

import com.example.githubdemo.Repository.UserRepository;
import com.example.githubdemo.entities.Users;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public UserService {
    final UserRepository repo;

    public UserService(UserRepository repo){
        this.repo = repo;

    }
    public Users addUser(Users user){
        return repo.save(user);
    }

}
