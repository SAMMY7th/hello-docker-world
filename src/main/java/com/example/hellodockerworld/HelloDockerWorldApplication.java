package com.example.hellodockerworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDockerWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDockerWorldApplication.class, args);
	}

	@RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
