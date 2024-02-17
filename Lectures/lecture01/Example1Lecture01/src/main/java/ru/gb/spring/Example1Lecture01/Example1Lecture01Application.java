package ru.gb.spring.Example1Lecture01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.gb.spring.Example1Lecture01.car.Car;
import ru.gb.spring.Example1Lecture01.car.Engine;

@SpringBootApplication
public class Example1Lecture01Application {

	public static void main(String[] args) {
		SpringApplication.run(Example1Lecture01Application.class, args);
		Car car = new Car(new Engine());
	}

}
