package WhilePorDoWhile;

import java.util.Scanner;

public class SoloPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = 0;
		
		System.out.println("Ingrese un numero");
		int a = sc.nextInt();
		
		for (num = 0 ; num <= a ; num++) {
			if (num % 2 == 0) {
			System.out.println(num);	
			}
		}
	}
}
