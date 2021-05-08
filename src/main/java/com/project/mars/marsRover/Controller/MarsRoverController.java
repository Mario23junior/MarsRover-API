package com.project.mars.marsRover.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.mars.marsRover.Model.MarsRoverApiResponse;
import com.project.mars.marsRover.Service.MarsRoverApi;

@RestController
@RequestMapping("/api/v1/nasa/mars/")
public class MarsRoverController {
  
	MarsRoverApi marsRover;
	
	public MarsRoverController(MarsRoverApi marsRover) {
		this.marsRover = marsRover;
 	}
	
	@GetMapping("/")
	public MarsRoverApiResponse listData() {
		return marsRover.Datalist();
	}
}
