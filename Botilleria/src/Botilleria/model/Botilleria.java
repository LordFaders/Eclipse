package Botilleria.model;

public class Botilleria {
	private Cerveza cerveza;
	private String nombre;
	
	public Botilleria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Botilleria(Cerveza cerveza, String nombre) {
		super();
		this.cerveza = cerveza;
		this.nombre = nombre;
	}

	public Cerveza getCerveza() {
		return cerveza;
	}

	public void setCerveza(Cerveza cerveza) {
		this.cerveza = cerveza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Botilleria [cerveza=" + cerveza + ", nombre=" + nombre + ", toString()=" + super.toString() + "]";
	}
	
	

}
