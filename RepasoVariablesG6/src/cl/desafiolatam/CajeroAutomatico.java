package cl.desafiolatam;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {
		/*
		 * Desarrollar menu de cajero automatico Saldo inicial 1000000 girar consultar
		 * depositar
		 */

		Scanner sc = new Scanner(System.in);
		int saldo = 1000000; 
		System.out.println("Bienvenido ingrese su clave");
		String password = sc.nextLine();
		String palabra = "1234";

		System.out.println(palabra.compareTo(password));
		if (palabra.compareTo(password) == 0) {
			System.out.println("Digite la operacion que desea realizar");
		} else {
			System.out.println("clave inválida");
		}

		System.out.println("1 Girar");
		System.out.println("2 Depositar");
		System.out.println("3 Consultar Saldo");

		int numero = sc.nextInt();

		if (numero == 1) {
			System.out.println("Ingrese el monto a girar");
			int giro = sc.nextInt();
			if (giro > 1000000) {
				System.out.println("Saldo Insuficiente");
			} else {
				int nuevoSaldo = 1000000 - giro;
				System.out.println("Su nuevo saldo es " + nuevoSaldo);
			}

		}else if (numero == 2) {
			System.out.println("Ingrese el monto a depositar");
			int deposito = sc.nextInt();
			int nuevoSaldo = 1000000 + deposito;
			System.out.println("Su nuevo Saldo es " + nuevoSaldo);
		}
		
		else if(numero == 3) {
			System.out.println("Su saldo es 1000000");
		}
		

	}

}
