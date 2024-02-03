package com.ar.therapist.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	@RequestMapping("/userFallBack")
//	@CircuitBreaker(name = "userFallBack")
	public Mono<String> userServiceFallBack() {
		return Mono.just("User Service is Taking too Long to respond or is down."
				+ "Please try again later");
	}
	
	@RequestMapping("/adminFallBack")
	public Mono<String> adminServiceFallBack() {
		return Mono.just("Admin Service is Taking too Long to respond or is down."
				+ "Please try again later");
	}
	
	
	@RequestMapping("/therapistFallBack")
	public Mono<String> therapistServiceFallBack() {
		return Mono.just("Therapist Service is Taking too Long to respond or is down."
				+ "Please try again later");
	}
	
//	@RequestMapping("/userServiceFallback")
//	public String userServiceFallbackMethod() {
//		return "User Service is Taking too Long to respond or is down."
//				+ "Please try again later";
//	}
//	@RequestMapping("/adminServiceFallback")
//	public String adminServiceFallbackMethod() {
//		return "Admin Service is Taking too Long to respond or is down."
//				+ "Please try again later";
//	}
}
