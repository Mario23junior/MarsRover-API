package com.project.mars.marsRover.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsCamera {
   
	private Long id;
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("rover_id")
	private Long roverId;
	
	@JsonProperty("full_name")
	private String fullName;
	
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
	public Long getRoverId() {
		return roverId;
	}
	public void setRoverId(Long roverId) {
		this.roverId = roverId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "MarsCamera [id=" + id + ", nome=" + nome + ", roverId=" + roverId + ", fullName=" + fullName + "]";
	}
	
	
	
}
