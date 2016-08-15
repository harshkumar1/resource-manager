package edu.psu.sweng568;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class ResourceManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceManagerApplication.class, args);
	}
	
	@Configuration
	@EnableWebMvc
	public class WebConfig extends WebMvcConfigurerAdapter {

		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/api/**")
				.allowedOrigins("http://localhost:51700")
				.allowedMethods("PUT", "DELETE", "GET")
				.allowedHeaders("header1", "header2", "header3")
				.exposedHeaders("header1", "header2")
				.allowCredentials(false).maxAge(3600);
		}
	}
}
