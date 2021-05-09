package com.project.mars.marsRover.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.mars.marsRover.Model.MarsRoverApiResponse;

@Service
public class MarsRoverApi {
	
	 private String keyApi = "O9GhnLpLgZPJ6ZvdMEaDtqXZUmnbdVC1tlf9SG55";
 	
 	 public MarsRoverApiResponse Datalist(Integer marsSol , String roverType, String camera, Integer page) {
		RestTemplate restTemplate = new RestTemplate();
		
		String urlApi = "https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?"+camera+"&sol="+marsSol+"&page="+page+"&api_key="+keyApi;
		
		ResponseEntity<MarsRoverApiResponse> response = restTemplate.getForEntity(urlApi,MarsRoverApiResponse.class);
		return(response.getBody());		
		
	}
}
 