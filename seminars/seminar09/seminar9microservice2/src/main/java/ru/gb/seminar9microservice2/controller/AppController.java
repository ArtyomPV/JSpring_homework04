package ru.gb.seminar9microservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class AppController {
    @GetMapping("/hello")
    public String htllo(){
        return "Hello from service2";
    }
}
