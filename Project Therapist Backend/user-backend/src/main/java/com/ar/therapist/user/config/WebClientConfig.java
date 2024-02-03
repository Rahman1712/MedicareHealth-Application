package com.ar.therapist.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
	
	@Bean
	public WebClient webClient() {
		return WebClient.builder().build();
	}
	
//    @Bean
//    public WebClient.Builder loadBalancedWebClientBuilder() {
//        return WebClient.builder();
//    }
}
