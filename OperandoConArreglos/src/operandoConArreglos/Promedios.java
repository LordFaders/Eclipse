package operandoConArreglos;

import java.util.ArrayList;
import java.util.Arrays;

public class Promedios {

	public static void main(String[] args) {
		multiplosdetres(args);
		promedio(args);
	}

	public static void multiplosdetres(String[] args) {

		ArrayList<String> numeros = new ArrayList<String>(Arrays.asList(args));

		ArrayList<Integer> multiplo = new ArrayList<Integer>();

		int numero = 0, suma = 0;

		for (int i = 0; i < numeros.size(); i++) {

			numero = Integer.parseInt(numeros.get(i));
			if (numero % 3 == 0) {

				suma = suma + numero;
			}

		}
		System.out.println("el resultado de la suma es:" + suma);
	}

	public static void promedio(String[] args) {
		int suma = 0;
		int contador = 0;
		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) % 3 == 0) {
				suma = suma + Integer.parseInt(args[i]);
				contador++;
			}
		}
		float promedio = suma / contador;

		System.out.println("el resultado de la promedio es: " + promedio);
	}

}
