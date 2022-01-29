package WhilePorDoWhile;

import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, suma = 0;

		System.out.print("Ingrese numero: ");
		N = sc.nextInt();

		if (N >= 0) {
			for (int i = 1; i <= N; i = i + 2) {
				suma += i;
			}

			System.out.println("El valor total es: " + suma);
		}else{
            System.out.println("El valor introducido no es mayor a 0");

	}
	}
}
