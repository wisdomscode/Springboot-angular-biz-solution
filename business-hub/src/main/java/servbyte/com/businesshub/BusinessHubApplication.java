package servbyte.com.businesshub;

import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
public class BusinessHubApplication {

	public static void main(String[] args) {
		 SpringApplication.run(BusinessHubApplication.class, args);
	}

	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowCredentials(true);
		configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
		configuration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin", "Authorization",
				"Content-Type", "Accept", "X-Requested-With", "Access-Control-Request-Method",
				"Access-Control-Request-Headers"));
		configuration.setExposedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin", "Authorization",
				"Content-Type", "x-auth-token", "Access-Control-Allow-Credentials"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return new  CorsFilter(source);
	}
}
