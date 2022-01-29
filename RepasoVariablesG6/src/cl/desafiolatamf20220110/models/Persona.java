package cl.desafiolatamf20220110.models;

public class Persona {
	private String nombre;
	private String rut;
	private float altura;
	private Direccion direccion;
	//el valor inicial para los atributos de tipo objeto es nulo
	 //constructores
	public Persona() {
		super();
		
	}
	
	public Persona(String nombre, String rut) {
		super();
		this.nombre = nombre;
		this.rut = rut;
	}
	public Persona(String rut, float altura) {
		super();
		this.rut = rut;
		this.altura = altura;
	}

	public Persona(String nombre, String rut, float altura) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.altura = altura;
	}
	public Persona(String nombre, String rut, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public float getAltura() {
		return altura;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", altura=" + altura + "]";
	}
	
	}
	
	



