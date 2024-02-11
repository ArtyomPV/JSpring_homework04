package ru.gb.spring.Example1Lecture01.plane;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LocalPlaneEngine{
    public LocalPlaneEngine() {
        System.out.println("Двигатель самолета запущен");

    }
    public void go(){
        System.out.println("Самолет взлетает!");
    }
}
