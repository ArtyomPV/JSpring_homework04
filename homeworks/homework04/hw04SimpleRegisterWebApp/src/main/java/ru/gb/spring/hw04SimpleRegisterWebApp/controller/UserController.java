package ru.gb.spring.hw04SimpleRegisterWebApp.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.spring.hw04SimpleRegisterWebApp.model.User;
import ru.gb.spring.hw04SimpleRegisterWebApp.service.UserService;

import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/register")
    public String addUser(Model model){
        List<User> users =  userService.findAll();
        model.addAttribute("users", users);
        return "register";
    }
    @PostMapping("/register")
    public String addUser(User user, Model model){
        userService.addUser(user);
        model.addAttribute("user", user);
        System.out.println(user);

        return "redirect:users";
    }
    @GetMapping("/users")
    public String findAllUsers(Model model){
        List<User> users =  userService.findAll();
        model.addAttribute("users", users);
        return "users";
    }
}
