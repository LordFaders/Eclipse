package cl.desafiolatamf20220110;

import java.util.Scanner;

import cl.desafiolatam.f20220111.models.Vehiculo;
import cl.desafiolatamf20220110.models.Animal;
import cl.desafiolatamf20220110.models.Rueda;

public class Main {

	public static void main(String[] args) {
		// Instancia de una clase
		Scanner sc = new Scanner(System.in);
		String palabra = "esto es un texto";//new String("esto es un Texto");
		
		Vehiculo automovil = new Vehiculo();
		System.out.println(automovil.toString()); //cuando inicializamos valores son nulos
	
		//agregar informacion(setters o mutadores)
		automovil.setColor("Rojo");
		automovil.setTiporueda(4);
		automovil.setMotor("V8");
		automovil.setVelocidad(350.6f);
		
		//llamado de metodo
		System.out.println(automovil.toString());
		
		//acceder a los valores de los atributos individualmente:
		System.out.println(automovil.getMotor());
		
		Vehiculo auto = new Vehiculo();
		auto.setColor("Blanco");
		auto.setCantidadRuedas(5);
		auto.setMotor("V6");
		auto.setVelocidad(180f);
		System.out.println(auto.toString());
		System.out.println(auto.getMotor());
		
		System.out.println("**********");
		Vehiculo autito = new Vehiculo("Verde",palabra, palabra, palabra, palabra, 240.5f,4,"V4");
		
		System.out.println(autito.getColor());
		autito.setColor("Amarillo");
		System.out.println(autito.toString());
		//autito.setArranca();//
		System.out.println("--------");
		//String perfil, String tamanho, String marca//
		Rueda rueda1 = new Rueda("255","22inch","michelin");
		autito.setTiporueda(rueda1);
		System.out.println(autito.toString());
		
		Animal animal1 = new Animal("Perro","Pastor Aleman","Negro");
		animal1.setAnimal(animal1);
		System.out.println(animal1.toString());

		
	
	}

}
