package com.techtalk.hellotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class HelloTechTalkMicro_1 {

	public static void main(String[] args) {

		SpringApplication.run(HelloTechTalkMicro_1.class, args);
	}

	@RequestMapping
	public String helloTechTalk() {
		return "Hello TechTalk Debu...";
	}
}