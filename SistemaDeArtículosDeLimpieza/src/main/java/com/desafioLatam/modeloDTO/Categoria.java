package com.desafioLatam.modeloDTO;

public class Categoria {

	private int id_categoria;
	private String nombre_Categoria;

	public Categoria() {

	}

	public Categoria(int id_categoria, String nombre_Categoria) {
		super();
		this.id_categoria = id_categoria;
		this.nombre_Categoria = nombre_Categoria;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre_Categoria() {
		return nombre_Categoria;
	}

	public void setNombre_Categoria(String nombre_Categoria) {
		this.nombre_Categoria = nombre_Categoria;
	}

}
