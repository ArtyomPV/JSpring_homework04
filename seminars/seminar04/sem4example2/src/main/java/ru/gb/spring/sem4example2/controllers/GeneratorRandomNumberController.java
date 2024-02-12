package ru.gb.spring.sem4example2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class GeneratorRandomNumberController {

    @GetMapping("/random") // http://localhost:8080/random
    public String randomNumber(Model model){
        int randomNumber = new Random().nextInt(1, 100);
        model.addAttribute("randomNumber", randomNumber);
        return "randomNumber";
    }

    @GetMapping("/range-random") // http://localhost:8080/range-random?min=1&max=5
    public String rangeRandomNumber(@RequestParam(name="min") int min, @RequestParam(name="max") int max, Model model){
        int randomNumber = new Random().nextInt(min, max + 1);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        model.addAttribute("randomNumber", randomNumber);
        return "range-randomNumber";
    }

    @GetMapping("/range-random/{min}/{max}") // http://localhost:8080/range-random/5/20
    public String newRangeRandomNumber(@PathVariable(name="min") int min,
                                    @PathVariable(name="max") int max,
                                    Model model){
        int randomNumber = new Random().nextInt(min, max + 1);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        model.addAttribute("randomNumber", randomNumber);
        return "range-randomNumber";
    }
    @GetMapping("/range-random/{min}-{max}") // http://localhost:8080/range-random/5-200
    public String otherRangeRandomNumber(@PathVariable(name="min") int min,
                                       @PathVariable(name="max") int max,
                                       Model model){
        int randomNumber = new Random().nextInt(min, max + 1);
        model.addAttribute("min", min);
        model.addAttribute("max", max);
        model.addAttribute("randomNumber", randomNumber);
        return "range-randomNumber";
    }

}
