package com.demohelloworld.app.demohelloworldapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages={"com.demohelloworld"})
public class DemohelloworldAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohelloworldAppApplication.class, args);
	}

}
