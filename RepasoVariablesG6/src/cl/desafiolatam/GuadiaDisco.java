package cl.desafiolatam;

import java.util.Scanner;

public class GuadiaDisco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Ingrese su edad:");
		int edad = sc.nextInt();
		System.out.println("Confirme si tiene un ticket (true / false)");
		boolean tieneTicket = sc.nextBoolean();
		System.out.println("Edad"+edad);
		System.out.println(tieneTicket);
		
		if(edad < 18 || tieneTicket == false) {
			System.out.println("No puede entrar");
		}else if (edad > 64 && tieneTicket == true) {
			System.out.println("Bienvenido, diríjase a la zona preferencial");
		}else {
			System.out.println("Bienvenido");
		}

}
}