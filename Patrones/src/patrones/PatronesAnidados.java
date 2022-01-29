package patrones;

import java.util.Scanner;

public class PatronesAnidados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Ingresa un numero");
		int n = sc.nextInt();
		System.out.println("Patrón 1");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1) {
					System.out.printf("*");
				} else {
					if (j == 0 || j == n - 1) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				}

			}
			System.out.printf("\n");
		}
		System.out.println();
		System.out.println("Patrón 2");

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i == 1 || i == n || i == j) {
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}

			}
			System.out.printf("\n");
		}

		System.out.println();
		System.out.println("Patrón 3");

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == j)
				{
					System.out.print("*");
				} else if (i + j == (n + 1))
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.printf("\n");
		}

		System.out.println();
		System.out.println("Patrón 4");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if ((i == j && i == 0) || (i == j && i == (n-1))) {
					System.out.printf("*");
				}else if (j != 0 && j !=(n-1)){
					System.out.printf("*");	
				}else {
					System.out.print(' ');
				}

			}
			System.out.printf("\n");
	}
	}
}
