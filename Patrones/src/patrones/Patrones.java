package patrones;

import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el tamaño del patrón deseado:");
		int n = sc.nextInt();
		int i;

		for (i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.printf("*");
			} else {
				System.out.printf(".");
			}
		}
		System.out.println();

		for (i = 1; i <= n; i++) {
			if (i > 4) {
				if (i % 4 == 1) {
					System.out.printf("1");
				} else if (i % 4 == 2) {
					System.out.printf("2");
				} else if (i % 4 == 3) {
					System.out.printf("3");
				} else if (i % 4 == 0) {
					System.out.printf("4");
				}
			} else {
				System.out.print(i);
			}
		}
		System.out.println();
		for (i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.printf("*");
			} else {
				System.out.printf("|");
			}
		}
	}
}
