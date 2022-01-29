package cl.desafiolatam.f20220111.models;

import cl.desafiolatamf20220110.models.Rueda;

public class Vehiculo {
	
	private String patente;
	private String Marca;
	private String Modelo;
	private String motor;
	private String color;
	private float velocidad;
	private int cantidadRuedas;
	private String tiporueda;
	
	public Vehiculo() {
		super();
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	public int getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}

	public String getTiporueda() {
		return tiporueda;
	}

	public void setTiporueda(String tiporueda) {
		this.tiporueda = tiporueda;
	}

	public Vehiculo(String patente, String marca, String modelo, String motor, String color, float velocidad,
			int cantidadRuedas, String tiporueda) {
		super();
		this.patente = patente;
		Marca = marca;
		Modelo = modelo;
		this.motor = motor;
		this.color = color;
		this.velocidad = velocidad;
		this.cantidadRuedas = cantidadRuedas;
		this.tiporueda = tiporueda;
	}

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", Marca=" + Marca + ", Modelo=" + Modelo + ", motor=" + motor
				+ ", color=" + color + ", velocidad=" + velocidad + ", cantidadRuedas=" + cantidadRuedas
				+ ", tiporueda=" + tiporueda + "]";
	}

	
}
