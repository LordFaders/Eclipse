package cl.desafiolatamf20220103;

public class ArrayEstaticos {

	public static void main(String[] args) {
		// conjunto de datos, separados por coma, ordemados según su ingreso
		// todos los arreglos comienzan en la posición cero
		// TipoDato[] variable = new TipoDato [cantidadElementos]
		// variable.length -> tamaño del arreglo.
		
		int[] numeros = new int[4];
		// agregar valores al arreglo
		// variable[posicion]
		numeros[0] = 1;
		System.out.println(numeros[3]);
		numeros[1] = 77;
		numeros[2] = 42;
		numeros[3] = 9;
	  //numeros[4] = 0;//fuera de índice
		
		String[] vocales = {"a","e","i","o","u"};
		vocales[0] = "y"; //si existe sobreescribe el valor en esa posición
		System.out.println("valor en la posición cero " + vocales[0]);
		System.out.println(vocales.length);
		
		System.out.println(vocales[vocales.length-1]);
		
		//recorrer el arreglo for -> use index on array
		for (int i = 0; i < vocales.length; i++) {
			vocales[i] =  "s";
			System.out.println(vocales[i]);
			
		}
	}

}
