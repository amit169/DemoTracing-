package com.demo.aop.app.DemoForAOP;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@ComponentScan(basePackages = {"com.uae.aop.aspect","com.demo.aop.app.DemoForAOP"})

public class DemoForAopApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoForAopApplication.class, args);

	}



}
