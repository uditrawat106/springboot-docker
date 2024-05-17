package com.example.spingbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpingbootDockerDemoApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Spring boot docker demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpingbootDockerDemoApplication.class, args);
	}

}
