package ru.gb.spring.hw04SimpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyWebController {

    @GetMapping()
    public String greeting(){
        return "index.html";
    }
}
