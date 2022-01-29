package vehiculo;

import vehiculo.model.Auto;

public class Main {

	public static void main(String[] args) {

		Auto instanciaAuto = new Auto();
		System.out.println("Auto creado");
		instanciaAuto.aumentarVelocidad();
		System.out.println(instanciaAuto.toString());
		
		Auto instancia = new Auto(null, null, null, 0, false, false, true, 2020);
		System.out.println("Auto Creado");
		System.out.println(instancia.toString());
		instancia.circulacionCiudad();

	}

}
