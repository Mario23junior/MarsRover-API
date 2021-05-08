package com.project.mars.marsRover.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhoto {
   
	private Long id;
	private Integer sol;
	private MarsCamera camera;
	
	@JsonProperty("img_src")
	private String imgSrc;
	
	@JsonProperty("earth_date")
	private String earth_date;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getSol() {
		return sol;
	}
	public void setSol(Integer sol) {
		this.sol = sol;
	}
	public MarsCamera getCamera() {
		return camera;
	}
	public void setCamera(MarsCamera camera) {
		this.camera = camera;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	
	public String getEarth_date() {
		return earth_date;
	}
	public void setEarth_date(String earth_date) {
		this.earth_date = earth_date;
	}
	
	@Override
	public String toString() {
		return "MarsPhoto [id=" + id + ", sol=" + sol + ", camera=" + camera + ", imgSrc=" + imgSrc + "]";
	}
}
