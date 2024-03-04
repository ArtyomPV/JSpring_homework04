package ru.gb.spring.hw04SimpleRegisterWebApp.service;

import org.springframework.stereotype.Service;
import ru.gb.spring.hw04SimpleRegisterWebApp.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public List<User> findAll(){
        return users;
    }
}
