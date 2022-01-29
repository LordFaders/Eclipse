package cl.desafiolatamf20220110.models;

public class Animal {
	private String nombre;
	private String raza;
	private String color;
	public Animal() {
		super();
	}
	public Animal(String nombre, String raza, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", color=" + color + "]";
	}
	public void setAnimal(Animal animal1) {
		// TODO Auto-generated method stub
		
	}
	
	

}
