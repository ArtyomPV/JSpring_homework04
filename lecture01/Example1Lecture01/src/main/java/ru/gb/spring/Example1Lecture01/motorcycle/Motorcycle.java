package ru.gb.spring.Example1Lecture01.motorcycle;

import org.springframework.stereotype.Service;

@Service
public class Motorcycle {
    MotorEngine engine;

    public Motorcycle(MotorEngine engine) {
        this.engine = engine;
        engine.go();
    }
    public void start(){

    }
}
