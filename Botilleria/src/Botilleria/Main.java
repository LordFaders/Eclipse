package Botilleria;

import Botilleria.model.Botella;
import Botilleria.model.Botilleria;
import Botilleria.model.Cerveza;

public class Main {

	public static void main(String[] args) {
		
		Botella botella = new Botella("vidrio", "lata");
		
		Cerveza cerveza = new Cerveza(1500, botella);
		System.out.println(cerveza.toString());
		
		Botilleria botilleria = new Botilleria();
		
		

	}

}
