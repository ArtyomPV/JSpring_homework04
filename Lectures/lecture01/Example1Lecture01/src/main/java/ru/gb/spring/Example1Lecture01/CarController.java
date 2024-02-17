package ru.gb.spring.Example1Lecture01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.spring.Example1Lecture01.motorcycle.Motorcycle;

@RestController
public class CarController {
    @Autowired
    Motorcycle motorcycle;

    /**
     * GetMapping("/car") запускает на локальном сервере страничку
     * @return возвращает надпись
     */
    @GetMapping("/car")
    public String startCar(){
        motorcycle.start();
        return "Мотоцикл запущен";
    }
}
