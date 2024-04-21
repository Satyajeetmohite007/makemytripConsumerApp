package com.nt.config;


	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

	@Configuration
	public class RestConfig {

		 @Bean
		  public WebClient.Builder webClientBuilder() {

		    return WebClient.builder();
		     
	    }
	}