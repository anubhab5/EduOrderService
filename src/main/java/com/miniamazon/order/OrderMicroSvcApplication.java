package com.miniamazon.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderMicroSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMicroSvcApplication.class, args);
	}

}
