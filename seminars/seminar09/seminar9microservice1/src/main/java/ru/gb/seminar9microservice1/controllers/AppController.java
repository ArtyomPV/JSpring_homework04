package ru.gb.seminar9microservice1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class AppController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello from service1");
        return "Hello from service1";
    }
}
