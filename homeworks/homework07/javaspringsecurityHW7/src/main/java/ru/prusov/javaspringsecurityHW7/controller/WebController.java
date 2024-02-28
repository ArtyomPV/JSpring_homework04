package ru.prusov.javaspringsecurityHW7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {

@GetMapping("/public")
    public String publicPage(){
        return "public-data";
    }
    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }
    @GetMapping("/private")
    public String privatePage(){
        return "private-data";
    }

    @GetMapping("/login")
    public String login(){
    return "login";
    }
}
