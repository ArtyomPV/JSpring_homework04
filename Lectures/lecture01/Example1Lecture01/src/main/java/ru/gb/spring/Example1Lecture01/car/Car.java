package ru.gb.spring.Example1Lecture01.car;

public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        engine.go();
    }
}
