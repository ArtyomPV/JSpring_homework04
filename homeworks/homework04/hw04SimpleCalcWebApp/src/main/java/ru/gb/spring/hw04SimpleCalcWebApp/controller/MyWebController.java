package ru.gb.spring.hw04SimpleCalcWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class MyWebController
{
    @GetMapping("")
    public String addTwoNumbers(Model model){
        int num1 = new Random().nextInt(1, 10);
        int num2 = new Random().nextInt(1, 10);
        int sum = num1 + num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("sum", sum);
        return "index";
    }
}
