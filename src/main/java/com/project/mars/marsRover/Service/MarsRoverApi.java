package com.project.mars.marsRover.Service;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.project.mars.marsRover.Model.MarsRoverApiResponse;

import reactor.core.publisher.Mono;

@Service
public class MarsRoverApi {
	
	private WebClient webClient;
	
	 public MarsRoverApi(WebClient webClient) {
		 this.webClient = webClient;
 	}
	
	 private String keyApi = "O9GhnLpLgZPJ6ZvdMEaDtqXZUmnbdVC1tlf9SG55";
 	
 	 public MarsRoverApiResponse Datalist(Integer marsSol , String roverType, String camera, Integer page) {
		String urlApi = "/mars-photos/api/v1/rovers/"+roverType+"/photos?"+camera+"&sol="+marsSol+"&page="+page+"&api_key="+keyApi;
		
 Mono<MarsRoverApiResponse> bodyResponseDatas = this.webClient
	 		     .method(HttpMethod.GET)
	 		     .uri(urlApi)
	 		     .retrieve()
	 		     .bodyToMono(MarsRoverApiResponse.class);
 
            MarsRoverApiResponse  marsRoverInfo = bodyResponseDatas.block();
 	      return marsRoverInfo; 
	}
}
 