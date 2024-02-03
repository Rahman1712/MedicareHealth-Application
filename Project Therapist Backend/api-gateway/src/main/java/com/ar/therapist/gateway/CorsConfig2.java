//package com.ar.therapist.gateway;
//
//import java.util.Arrays;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
////@Configuration
////public class CorsConfig implements WebMvcConfigurer {
////
////    @Override
////    public void addCorsMappings(CorsRegistry registry) {
////        registry.addMapping("/admins/api/v1/auth/**")
////                .allowedOrigins("http://localhost:4200")
////                .allowedMethods("GET", "POST", "PUT", "DELETE")
////                .allowedHeaders("*");
////    }
////
////    @Bean
////    public CorsFilter corsFilter() {
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        CorsConfiguration config = new CorsConfiguration();
////
////        config.setAllowCredentials(true);
////        config.addAllowedOrigin("http://localhost:4200");
////        config.addAllowedHeader("*");
////        config.addAllowedMethod("*");
////
////        source.registerCorsConfiguration("/**", config);
////        return new CorsFilter(source);
////    }
////}
//
//
////@Configuration
//public class CorsConfig2 implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/admins/api/v1/auth/**")
//            .allowedOrigins("http://localhost:4200") // Add the appropriate frontend origin
//            .allowedMethods("GET", "POST", "PUT", "DELETE") // Add allowed HTTP methods
//            .allowedHeaders("*"); // Add allowed headers
//    }
//
//	@Value("${cors.set.allowed.origins}")
//	private String[] CROSS_ORIGIN_URLS;
//	
////	@Bean
//	public CorsFilter corsFilter() {
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		corsConfiguration.setAllowCredentials(true);
////		corsConfiguration.setAllowedOrigins(Arrays.asList(CROSS_ORIGIN_URLS));
//		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//		corsConfiguration.setAllowedHeaders(Arrays.asList(
//					"Origin","Access-Control-Allow-Origin", "Content-Type",
//					"Accept","Authorization","Origin, Accept","X-Requested-With",
//					"Access-Control-Request-Method","Access-Control-Request-Headers"
//				));
//		corsConfiguration.setExposedHeaders(Arrays.asList(
//					"Origin","Content-Type","Accept","Authorization",
//					"Access-Control-Allow-Origin","Access-Control-Allow-Origin",
//					"Access-Control-Allow-Credentials"
//				));
//		corsConfiguration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
//		
//		corsConfiguration.addAllowedOrigin("http://localhost:5173");
//		corsConfiguration.addAllowedOrigin("http://localhost:3000");
//		corsConfiguration.addAllowedOrigin("http://localhost:4200");
//		corsConfiguration.addAllowedHeader("*");
//		corsConfiguration.addAllowedMethod("*");
//		
//		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//		return new CorsFilter(urlBasedCorsConfigurationSource);
//	}
//}
