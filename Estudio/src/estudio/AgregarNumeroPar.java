package estudio;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregarNumeroPar {

	public static void main(String[] args) {

	}

	public static void agregarNumeroPar(int numero) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numeros");
		numero1 = sc.nextInt();
		for (int i = 0; i < numeros.size(); i++)
			;
		{
			if (numero1 % 2 == 0) {
				numeros.add(numero1);
			}
			System.out.println(numeros);
		}
	}
}
