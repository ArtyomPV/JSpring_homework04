package ru.gb.prusov.hw09eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Hw09eurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hw09eurekaApplication.class, args);
	}

}
