package com.desafiolatam.models;

public class Auto {
	//id, marca, modelo, color, velocidad
	
	private Integer id;
	private String marca;
	private String modelo;
	private String color;
	private Float velocidad;
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public Auto(Integer id, String marca, String modelo, String color, float velocidad) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = velocidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	

}
