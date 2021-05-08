package com.project.mars.marsRover.Model;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverApiResponse {
    
	List<MarsPhoto> photos = new ArrayList<>();
	
	@Override
	public String toString() {
		return "MarsRoverApiResponse [photos=" + photos + "]";
	}

	public List<MarsPhoto> getPhotos() {
		return photos;
	}
	
	
	
	
}
