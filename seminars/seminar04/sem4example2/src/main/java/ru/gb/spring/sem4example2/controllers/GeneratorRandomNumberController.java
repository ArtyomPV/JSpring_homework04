package ru.gb.spring.sem4example2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class GeneratorRandomNumberController {

    @GetMapping("/random")
    public String randomNumber(Model model){
        int randomNumber = new Random().nextInt(1, 100);
        model.addAttribute("randomNumber", randomNumber);
        return "randomNumber";
    }

}
