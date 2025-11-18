package com.example.githubdemo.services;

import com.example.githubdemo.dtos.UserDto;
import com.example.githubdemo.entities.Users;
import com.example.githubdemo.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }
    public Users addUser(UserDto userDto) {
        Users user = new Users();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        return repo.save(user);
    }
}
