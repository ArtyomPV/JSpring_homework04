package ru.gb.hw05SimpleWebpageDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ru.gb.hw05SimpleWebpageDB.models.Task;

@SpringBootApplication
public class Hw05SimpleWebpageDbApplication {

	public static void main(String[] args) {
		Task task = new Task("gb");
		System.out.println(task.getStatus());
		SpringApplication.run(Hw05SimpleWebpageDbApplication.class, args);
	}


}
