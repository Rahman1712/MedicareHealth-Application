package com.ar.therapist.gateway;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

//@Configuration
//@EnableWebFlux
public class CorsGlobalConfiguration implements WebFluxConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
    	System.err.println("TTTTTTTTTTTTPPPPPPPPPPPPPPPPPPP");
        corsRegistry
          .addMapping("/**")
//          .addMapping("/admins/api/v1/auth/**")
          .allowCredentials(true)
          .allowedOrigins("http://localhost:4200")
          .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
          .allowedHeaders("Origin","Access-Control-Allow-Origin", "Content-Type",
					"Accept","Authorization","Origin, Accept","X-Requested-With",
					"Access-Control-Request-Method","Access-Control-Request-Headers")
          .exposedHeaders("Origin","Content-Type","Accept","Authorization",
					"Access-Control-Allow-Origin","Access-Control-Allow-Origin",
					"Access-Control-Allow-Credentials")
          .maxAge(3600);
    }
}