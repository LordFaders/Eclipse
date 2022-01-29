package cl.desafiolatam;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		//String nombreCompleto, String correo, int edad
		Persona persona1 = new Persona("Pepe Lota", "pepel@mimail.com", 25);
		//System.out.println(persona1.toString());
		Persona persona2 = new Persona("Juan Perez", "jp@mimail.com", 35);
		
		//agregar persona
		agregarPersona(Persona1);
		agregarPersona(Persona2);
		
		

	}

}
