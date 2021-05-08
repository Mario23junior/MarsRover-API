package com.project.mars.marsRover;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.project.mars.marsRover.Model.MarsRoverApiResponse;

public class MarsRoverTeste {
   
	private String urlKey = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY";
	
	@Test
	public void Datalist() {
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<MarsRoverApiResponse> response = restTemplate.getForEntity(urlKey,MarsRoverApiResponse.class);
		System.out.println(response.getBody());
	}
}
