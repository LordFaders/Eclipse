package cl.desafiolatam.f20220113;

import cl.desafiolatam.f20220113.models.Animal;
import cl.desafiolatam.f20220113.models.Gato;
import cl.desafiolatam.f20220113.models.Perro;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.emitirSonido();
		animal.setSexo("Hembra");

		/**
		 * POLIMORFISMO
		 **/

		Animal perroAnimal = new Perro();
		perroAnimal.emitirSonido();
		perroAnimal.setSexo("Macho");

		/* Casting, para utilizar los atributos y métodos de la clase hijo */
		Perro perro = (Perro) perroAnimal;
		perro.setRaza("Bulldog");
		System.out.println(perro.toString());

		Animal gatoAnimal = new Gato();
		gatoAnimal.emitirSonido();
		gatoAnimal.setSexo("Hembra");
		
		Gato gato = (Gato) gatoAnimal;
		
		
		Gato tom = new Gato();
		
		Animal tomas = tom;

	}

}
