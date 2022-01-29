package WhilePorDoWhile;

import java.util.Scanner;

public class SumaImparLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int minimo = 0;
		int maximo = 0;
		int suma = 0;

		System.out.print("Ingrese el rango mínimo:");
		minimo = sc.nextInt();
		System.out.print("Ingrese el rango máximo:");
		maximo = sc.nextInt();

		for (int i = minimo; i <= maximo; i++) {
			if (i % 2 == 1)
				suma += i;

		}

		System.out.println("El valor total es: " + suma);

	}
}
