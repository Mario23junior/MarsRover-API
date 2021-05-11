package com.project.mars.marsRover.Utils;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebClientConfig {
    
	@Bean
	public WebClient webClient(WebClient.Builder builder) {
	  return builder
		    .baseUrl("https://api.nasa.gov")
		    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
		    .build();
	}
}
