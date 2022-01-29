package cl.desafiolatam;

public class Variables {

	public static void main(String[] args) {

		System.out.println("Hola Mundo");

		String despedida = "Chao Mundo";

		System.out.println(despedida);

		int numero = 4;
		int numero2 = 3;
		/*
		 * Esto es un comentario de más de una línea
		 */

		int suma = numero + numero2;// suma de dos números
		System.out.println(numero + numero2);// 7
		System.out.println("el resultado es: " + suma);// String+int=la concatenación de tipo String
		System.out.println("------------------");

		String numero3 = "5";
		int numero4 = 2;

		System.out.println(numero3 + numero4);

		Integer num1 = 6;
		Integer num2 = 7;

		System.out.println("El resultado de la suma es: " + (num1 + num2));

		String numeroTexto = num1.toString();
		System.out.println("El resultado de la suma es: " + (numeroTexto + num2));

		System.out.println("------------------");

		float nota1 = 5.4f;
		float nota2 = 6.2f;
		float nota3 = 6.8f;

		float promedio = (nota1 + nota2 + nota3) / 3;
		
		//System.out.println("El promedio de las notas es: "+Math.round(promedio*10)/10f);
		System.out.println("El promedio de las notas"+nota1+","+nota2+" y "+nota3+" es: " +Math.round(promedio*10)/10f);
	}

}
