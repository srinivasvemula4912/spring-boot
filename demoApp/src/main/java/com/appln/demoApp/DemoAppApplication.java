package com.appln.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages = {"com.appln.controller"})
@SpringBootApplication
@EnableJpaRepositories("com.appln.dao")
@EntityScan("com.appln.model")
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
		System.out.println("after run");
	}
	

}
