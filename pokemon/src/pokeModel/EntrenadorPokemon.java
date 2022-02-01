package pokeModel;

import java.util.ArrayList;

public class EntrenadorPokemon {
	private String nombre;
	private String ciudadOrigen;
	//Pokemon pokemon;
	ArrayList<Pokemon> pokemones;
	
	public EntrenadorPokemon() {
		// TODO Auto-generated constructor stub
	}

	public EntrenadorPokemon(String nombre, String ciudadOrigen, ArrayList<Pokemon> pokemones) {
		super();
		this.nombre = nombre;
		this.ciudadOrigen = ciudadOrigen;
		this.pokemones = pokemones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public ArrayList<Pokemon> getPokemones() {
		return pokemones;
	}

	public void setPokemones(ArrayList<Pokemon> pokemones) {
		this.pokemones = pokemones;
	}

	@Override
	public String toString() {
		return "EntrenadorPokemon [nombre=" + nombre + ", ciudadOrigen=" + ciudadOrigen + ", pokemones=" + pokemones
				+ "]";
	}
	
	

}
