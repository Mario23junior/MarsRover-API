package com.project.mars.marsRover.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsRover {
   
	private Long id;
	private String nome;

	@JsonProperty("landing_date")
 	private Date landingDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getLandingDate() {
		return landingDate;
	}

	public void setLandingDate(Date landingDate) {
		this.landingDate = landingDate;
	}

	@Override
	public String toString() {
		return "MarsRover [id=" + id + ", nome=" + nome + ", landingDate=" + landingDate + "]";
	}

	
	
}
