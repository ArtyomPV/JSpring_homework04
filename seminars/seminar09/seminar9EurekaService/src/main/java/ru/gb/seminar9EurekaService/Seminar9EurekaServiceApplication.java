package ru.gb.seminar9EurekaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Seminar9EurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Seminar9EurekaServiceApplication.class, args);
	}

}
