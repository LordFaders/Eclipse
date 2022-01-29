package operandoConArreglos;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplosDeTres {

	public static void main(String[] args) {
		multiplosdetres(args);
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
}
