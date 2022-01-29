package cl.desafiolatam;

import java.util.Scanner;

public class NombreEdad {

	public static void main(String[] args) {
		int edad = 34;
		String nombre = "William";
		String salida = String.format("%s tiene %d años.", nombre, edad);
		System.out.println(salida);

		
		String s ="Paralelepípedo";
		System.out.printf("%s\n",s.substring(4)); //lelepípedo
		System.out.printf("%s\n",s.substring(0,4)); //Para

		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		System.out.println(i);
		
		float a = 8.61f;
		int b;
		b = (int)a;
		
		int number = -782;
		String numeroAString = String.valueOf(number);
		String numeroAString2 = String.valueOf(-782);
		
}
}