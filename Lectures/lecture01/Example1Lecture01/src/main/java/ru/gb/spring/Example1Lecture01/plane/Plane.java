package ru.gb.spring.Example1Lecture01.plane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Plane {
    @Autowired
    PlaneEngine engine;

    public Plane() {
            }

    public void setEngine(PlaneEngine engine) {
        this.engine = engine;
    }
}
