package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernateDeploymentApplication {
	
	@GetMapping("/message")
	public String displayMessage() {
		return "Hello welcome to my world";
	}
	public static void main(String[] args) {
		SpringApplication.run(KubernateDeploymentApplication.class, args);
	}

}
