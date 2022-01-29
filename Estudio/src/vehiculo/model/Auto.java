package vehiculo.model;

public class Auto {
	private String marca;
	private String modelo;
	private String color;
	private int velocidadActual;
	private boolean motorEncendido;
	private boolean patente;
	private boolean permisoCirculacion;
	private int revisionTecnica;

	public Auto() {
		super();
	}

	public Auto(String marca, String modelo, String color, int velocidadActual, boolean motorEncendido, boolean patente,
			boolean permisoCirculacion, int revisionTecnica) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadActual = velocidadActual;
		this.motorEncendido = motorEncendido;
		this.patente = patente;
		this.permisoCirculacion = permisoCirculacion;
		this.revisionTecnica = revisionTecnica;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadActual="
				+ velocidadActual + ", motorEncendido=" + motorEncendido + ", patente=" + patente
				+ ", permisoCirculacion=" + permisoCirculacion + ", revisionTecnica=" + revisionTecnica + "]";
	}

	public void aumentarVelocidad(int velocidad) {
		velocidadActual = velocidadActual + velocidad;
	}

	public void aumentarVelocidad() {
		velocidadActual = velocidadActual + 10;
	}

	public void aumentarVelocidad(boolean maximoCiudad, boolean maximoCarretera) {
		if (maximoCiudad) {
			velocidadActual = velocidadActual + 50;
		}
		if (maximoCarretera) {
			velocidadActual = velocidadActual + 100;
		}
	}

	public void circulacionCiudad(int revisionTecnica) {
		revisionTecnica = 2021;
	}

	public void circulacionCiudad(boolean permisoCirculacion, boolean patente) {
		permisoCirculacion = false;
		patente = true;
	}

	public void circulacionCiudad() {
		if (revisionTecnica >= 2020 && permisoCirculacion == true && patente == true) {
			System.out.println("El auto tiene derecho a circular");
		} else {
			System.out.println("El auto no tiene derecho a circular");
		}
	}
}
