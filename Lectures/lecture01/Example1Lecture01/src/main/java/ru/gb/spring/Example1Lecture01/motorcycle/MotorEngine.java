package ru.gb.spring.Example1Lecture01.motorcycle;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public class MotorEngine {
    public MotorEngine() {
        System.out.println("ДВИГАТЕЛЬ МОТОЦИКЛА ЗАПУЩЕН НА МОЕМ НОУТБУКЕ");
    }
    public void go(){
        System.out.println("МОТОЦИКЛ ПОЕХАЛ!");
    }
}
