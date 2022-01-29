package cl.desafiolatamf20220110.models;

public class ConstructorMain {

	public static void main(String[] args) {
		Persona persona = new Persona("13333",1.82f);
		
		Direccion direccion = new Direccion();
		direccion.setNombre("Pablo Mistral");
		direccion.setNumero("123");
		
		persona.setDireccion(direccion);
				
		System.out.println(persona.toString());
				

	}

}
