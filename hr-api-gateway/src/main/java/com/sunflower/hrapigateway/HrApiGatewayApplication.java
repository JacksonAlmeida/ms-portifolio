package com.sunflower.hrapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HrApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayApplication.class, args);
	}

	@Bean
	RouteLocator myRoute (RouteLocatorBuilder builder) {
		return builder.routes()
				.route( x -> 
				x.path("/msg/**")
				.uri("lb://hr-portifolio"))
				.build();
	}
	
}
