package cl.desafiolatamf20220107.models;

import java.sql.Date;

public class Persona {
    //Atributos
	private String nombre;
	private int edad;
	private Date fechaNacimiento;
	private float altura;
	
	//Constructores
	//constructor vacío
	public Persona() {
		super();
	}
	//constructor con parámetros
	public Persona(String nombre, int edad, Date fechaNacimiento, float altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.altura = altura;
	}
	
	
	
	//getter&setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
		@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", altura="
				+ altura + "]";
	

	}
		//metodos/operaciones/funciones
		public static void caminar() {
		}
		public static void correr() {
		}
	}
	
	


