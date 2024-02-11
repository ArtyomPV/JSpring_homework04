package ru.gb.spring.SimplePage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.spring.SimplePage.domain.User;
import ru.gb.spring.SimplePage.repository.UserRepository;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        userRepository.save(new User(null, "Tom", "awe@er.com"));
        userRepository.save(new User(null, "Tim", "tim@er.com"));
        userRepository.save(new User(null, "Tum", "tum@er.com"));
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id);
    }
}
