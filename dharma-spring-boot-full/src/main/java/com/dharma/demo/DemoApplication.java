package com.dharma.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.*;

@SpringBootApplication
@EnableCaching
public class DemoApplication {

	@Value("${dharma.fileurl}")
	private String filePath;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurerAdapter() {
			public void addCorsMappings(CorsRegistry registry) {

			}

			@Override
			public void addResourceHandlers(ResourceHandlerRegistry registry) {
				registry.addResourceHandler("/upload/*")
						.addResourceLocations("file: " + filePath);
			}
		};
	}
}
