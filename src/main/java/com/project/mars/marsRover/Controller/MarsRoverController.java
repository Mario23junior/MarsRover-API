package com.project.mars.marsRover.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.mars.marsRover.Model.MarsRoverApiResponse;

@RestController
@RequestMapping("/api/v1/nasa/mars/")
public class MarsRoverController {
  
	private String urlKey = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY";
	
	 @GetMapping("/")
	 public MarsRoverApiResponse Datalist() {
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<MarsRoverApiResponse> response = restTemplate.getForEntity(urlKey,MarsRoverApiResponse.class);
		return(response.getBody());		
		
	}

}
