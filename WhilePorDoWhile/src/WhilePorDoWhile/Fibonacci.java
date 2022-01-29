package WhilePorDoWhile;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de números de la serie");
		int n = sc.nextInt();

		int f = 0;
		int t1 = 1;
		int t2;
		
		for(int i=1; i<=n; i++) {
			t2 = f;
			f = t1 + f;
			t1 = t2;
			System.out.println(t1);
		}
	}

}