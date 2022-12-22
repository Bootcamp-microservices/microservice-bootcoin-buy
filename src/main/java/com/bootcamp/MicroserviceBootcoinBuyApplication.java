package com.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MicroserviceBootcoinBuyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBootcoinBuyApplication.class, args);
	}

}
