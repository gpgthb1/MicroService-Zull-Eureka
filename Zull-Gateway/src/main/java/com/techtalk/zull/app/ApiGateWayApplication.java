package com.techtalk.zull.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.techtalk.zull.filter.SimpleZullFIlter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGateWayApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiGateWayApplication.class, args);
	}

	@Bean
	public SimpleZullFIlter simpleZullFIlter() {
		return new SimpleZullFIlter();
	}

}
