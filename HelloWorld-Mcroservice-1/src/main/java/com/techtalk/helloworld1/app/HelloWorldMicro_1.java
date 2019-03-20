package com.techtalk.helloworld1.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class HelloWorldMicro_1 {

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldMicro_1.class, args);
	}

	@RequestMapping
	public String helloWorld() {
		return "Hello World";
	}
}
