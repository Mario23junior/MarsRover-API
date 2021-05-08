package com.project.mars.marsRover.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.mars.marsRover.Model.MarsRoverApiResponse;

@Service
public class MarsRoverApi {
   
	private String urlKey = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY";
	
 	 public MarsRoverApiResponse Datalist() {
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<MarsRoverApiResponse> response = restTemplate.getForEntity(urlKey,MarsRoverApiResponse.class);
		return(response.getBody());		
		
	}
}
 