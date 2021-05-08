package com.project.mars.marsRover.Model;

public class MarsCamera {
   
	private Long id;
	private String nome;
	private Long rover_id;
	private String full_name;
	
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
	public Long getRover_id() {
		return rover_id;
	}
	public void setRover_id(Long rover_id) {
		this.rover_id = rover_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	@Override
	public String toString() {
		return "MarsCamera [id=" + id + ", nome=" + nome + ", rover_id=" + rover_id + ", full_name=" + full_name + "]";
	}
	
	
}
