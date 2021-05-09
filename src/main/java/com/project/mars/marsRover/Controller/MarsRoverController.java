package com.project.mars.marsRover.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public MarsRoverApiResponse listData(@RequestParam(required=false) String marsRoverData,
			@RequestParam(required = false) Integer marsSol,
	        @RequestParam(required = false) String robomars)
	      {
		
		MarsRoverApiResponse roverData = marsRover.Datalist(marsSol, robomars);
		return roverData;
	}
}
