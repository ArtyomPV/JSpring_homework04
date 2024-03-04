package ru.gb.seminar9apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Seminar9ApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Seminar9ApiGateWayApplication.class, args);
	}
		@Bean
		public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
			return builder.routes()
					.route("eureka_client1",r->r.path("/sum2numbers/**")
							.uri("http://localhost:9091/"))
					.route("eureka_client2",r->r.path("/users/**")
							.uri("http://localhost:9092/"))
							.build();}
}
