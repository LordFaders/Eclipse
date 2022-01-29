package com.desafiolatam;

public class EquipoFutbol {

	private Integer juegosGanados;
	private Integer juegosPerdidos;
	private Integer juegosEmpatados;
	
	

	public EquipoFutbol(Integer juegosGanados, Integer juegosPerdidos, Integer juegosEmpatados) {
		super();
		this.juegosGanados = juegosGanados;
		this.juegosPerdidos = juegosPerdidos;
		this.juegosEmpatados = juegosEmpatados;
	}

	public Integer getJuegosGanados() {
		return juegosGanados;
	}

	public void setJuegosGanados(Integer juegosGanados) {
		this.juegosGanados = juegosGanados;
	}

	public Integer getJuegosPerdidos() {
		return juegosPerdidos;
	}

	public void setJuegosPerdidos(Integer juegosPerdidos) {
		this.juegosPerdidos = juegosPerdidos;
	}

	public Integer getJuegosEmpatados() {
		return juegosEmpatados;
	}

	public void setJuegosEmpatados(Integer juegosEmpatados) {
		this.juegosEmpatados = juegosEmpatados;
	}



}
