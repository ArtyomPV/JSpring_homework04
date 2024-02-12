package ru.gb.spring.sem4example1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WebController {

    @GetMapping("/about")
    public String aboutPage(){
        return "about.html";
    }
}
