package ru.gb.spring.Example1Lecture01.plane;

import org.springframework.stereotype.Component;

@Component
public class ProPlaneEngine {
    public ProPlaneEngine() {
        System.out.println("Двигатель самолета запущен на сервере");

    }
    public void go(){
        System.out.println("Самолет взлетает! быстро");
    }
}
