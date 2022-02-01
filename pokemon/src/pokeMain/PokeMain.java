package pokeMain;

import java.util.ArrayList;

import pokeModel.Dibuja;
import pokeModel.EntrenadorPokemon;
import pokeModel.Pokemon;

public class PokeMain {

	public static void main(String[] args) {
		// https://www.asciiart.eu/video-games/pokemon
		Dibuja.dibujaTituloPokemon();
		//Bulbasaur
		//int id, String nombre, String descripcion, String tipo, int puntosVida, String danoAtaque, String dibujo
		Pokemon pokemon1= new  Pokemon(0001,"Bulbasaur","Este Pokémon nace con una semilla en el lomo.",
				"Planta",70,20,"");
		Pokemon pokemon2= new  Pokemon(0002,"Pikachu","sus mejillas se sobrecargan.",
				"Eléctrico",80,15,"");
		
		Pokemon pokemon3= new  Pokemon(0003,"Squirtle ","Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble.",
				"Agua",80,15,"");
		
		System.out.println(pokemon1.toString());
		System.out.println(pokemon2.toString());
		System.out.println(pokemon3.toString());
		
		ArrayList<Pokemon> pokemonesA= new ArrayList<Pokemon>();
		pokemonesA.add(pokemon1);
		pokemonesA.add(pokemon2);
		
		ArrayList<Pokemon> pokemonesB= new ArrayList<Pokemon>();
		pokemonesB.add(pokemon3);

		
		//String nombre, String ciudadOrigen, ArrayList<Pokemon> pokemones
		EntrenadorPokemon entrenador1 = new EntrenadorPokemon("Ash", "Pueblo Paleta", pokemonesA);
		EntrenadorPokemon entrenador2 = new EntrenadorPokemon("Gary", "Pueblo Paleta", pokemonesB);
		
		System.out.println("\n\n----------Torneo Pokemon-----------");
		System.out.println("ENTRENADORES: ");
		System.out.println(entrenador1.toString());
		System.out.println(entrenador2.toString());
		
		System.out.println("\n----------Inicio-----------");
		System.out.println("Entrenador "+entrenador1.getNombre()+" elige su pokemon: "+entrenador1.getPokemones().get(0).getNombre());
		System.out.println("Entrenador "+entrenador2.getNombre()+" elige su pokemon: "+entrenador2.getPokemones().get(0).getNombre());
		Pokemon pokemonTemp1 = entrenador1.getPokemones().get(0);
		Pokemon pokemonTemp2 = entrenador2.getPokemones().get(0);
		
		System.out.println("\n----------Puntos de vida pokemones-----------");
		System.out.println(pokemonTemp1.getNombre()+" HP "+pokemonTemp1.getPuntosVida());
		System.out.println(pokemonTemp2.getNombre()+" HP "+pokemonTemp2.getPuntosVida());
		System.out.println();
		int dano= pokemonTemp1.ataca();
		System.out.println(pokemonTemp1.getNombre()+" realiza "+dano+" puntos de daño!");
		

		pokemonTemp2.setPuntosVida(pokemonTemp2.getPuntosVida()-dano);
		System.out.println(pokemonTemp2.getNombre()+" HP "+pokemonTemp2.getPuntosVida());
		
		}

	}


