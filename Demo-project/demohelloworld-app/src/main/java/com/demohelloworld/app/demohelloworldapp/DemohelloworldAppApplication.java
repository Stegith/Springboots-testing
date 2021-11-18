package com.demohelloworld.app.demohelloworldapp;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.demohelloworld.app.demohelloworldapp"})
public class DemohelloworldAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohelloworldAppApplication.class, args);
	}
	@Bean
    CommandLineRunner init(TopicRepository topicRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                Topic topic = new Topic(name, name.toLowerCase() + "@domain.com");
                topicRepository.save(topic);
            });
			topicRepository.findAll().forEach(System.out::println);
        };
	}

}
