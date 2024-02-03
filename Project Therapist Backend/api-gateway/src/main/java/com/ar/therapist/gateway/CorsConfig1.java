//package com.ar.therapist.gateway;
//
//import java.util.Arrays;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//import org.springframework.web.reactive.config.EnableWebFlux;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
////@Configuration
//public class CorsConfig1 implements WebMvcConfigurer {
//
//  @Override
//  public void addCorsMappings(CorsRegistry registry) {
//      registry.addMapping("/**")
//              .allowedOrigins("http://localhost:4200")
//              .allowedMethods("GET", "POST", "PUT", "DELETE")
//              .allowedHeaders("*");
//  }
//
////  @Bean
//  public CorsFilter corsFilter() {
//      UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//      CorsConfiguration config = new CorsConfiguration();
//
//      config.setAllowCredentials(true);
//      config.addAllowedOrigin("http://localhost:4200");
//      config.addAllowedHeader("*");
//      config.addAllowedMethod("*");
//      config.addExposedHeader("*");
//
//      source.registerCorsConfiguration("/**", config);
//      return new CorsFilter(source);
//  }
//}
//
