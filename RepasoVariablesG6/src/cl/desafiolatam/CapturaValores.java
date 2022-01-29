package cl.desafiolatam;

import java.util.Scanner;

public class CapturaValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre= sc.nextLine();
		System.out.println("Ingrese su primer apellido: ");
		String apellido1= sc.nextLine();
		System.out.println("Ingrese su segundo apellido: ");
		String apellido2= sc.nextLine();
		System.out.println("Ingrese su edad: ");
		int edad=sc.nextInt();
		
		System.out.println("Su nombre es: "+nombre+" "+apellido1+" "+apellido2+"  \nSu edad es: "+edad);
		
	}

}