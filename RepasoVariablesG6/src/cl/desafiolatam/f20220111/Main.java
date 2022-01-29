package cl.desafiolatam.f20220111;

import cl.desafiolatam.f20220111.models.Auto;
import cl.desafiolatam.f20220111.models.Camion;
import cl.desafiolatam.f20220111.models.Camioneta;

public class Main {

	public static void main(String[] args) {
		Camioneta camioneta = new Camioneta();
		
		camioneta.setColor("Azul");
		System.out.println(camioneta.toString());
		
		Auto auto = new Auto();
		System.out.println(auto.toString());
		
		Camion camion = new Camion();
		System.out.println(camion.toString());
		
		
		
	

	}

}
