package cl.desafiolatamf20220110.models;

public class Direccion {
	private String nombre;
	private String numero;
	private String ciudad;
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Direccion(String nombre, String numero, String ciudad) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Direccion [nombre=" + nombre + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

	
}
