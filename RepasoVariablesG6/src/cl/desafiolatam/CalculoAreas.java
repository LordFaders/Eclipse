package cl.desafiolatam;

import java.util.Scanner;

public class CalculoAreas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("******** area cuadrado *******");
		
		System.out.println("Ingrese el lado del cuadrado");
		float ladoCuadrado = sc.nextFloat();
		float areaCuadrado = ladoCuadrado * ladoCuadrado;
		
		
		System.out.println("el área del cuadrado es: "+areaCuadrado);
		
		System.out.println("******** area triangulo *******");
		System.out.println("Ingrese la altura del triangulo");
		float alturaTriangulo = sc.nextFloat();
		System.out.println("Ingrese la base del triangulo");
		float baseTriangulo = sc.nextFloat();
		float areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
		
		System.out.println("el área del triángulo es: "+areaTriangulo);
		
		
		System.out.println("******** area circulo *******");
		
		System.out.println("Ingrese el valo del radio del circulo");
		float radioCirculo = sc.nextFloat();
		float areaCirculo = (float) (Math.PI * (radioCirculo * radioCirculo));
		
		System.out.println("el área del circulo es: "+areaCirculo);		
		
		

	}

}
