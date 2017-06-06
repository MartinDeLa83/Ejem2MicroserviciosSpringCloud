package com.atsistemas.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicioProductorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioProductorApplication.class, args);
	}
}
