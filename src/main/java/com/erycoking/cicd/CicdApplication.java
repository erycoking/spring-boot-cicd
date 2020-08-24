package com.erycoking.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class CicdApplication {

	@GetMapping("/")
	public Mono<ResponseEntity<String>> sayHello() {
		// say hello
		return Mono.just(ResponseEntity.ok().body("Hi there!!! Hooray you just configured ci cd successfully"));
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
