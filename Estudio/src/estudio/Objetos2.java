package estudio;

import java.util.Scanner;

public class Objetos2 {

	public static void main(String[] args) {
		division("22", "0");
	}

	public static int division(String valorUno, String valorDos) {
	int resultado = 0;
	try {
	int uno = Integer.parseInt(valorUno);
	int dos = Integer.parseInt(valorDos);
	resultado = uno/dos;
	}
	catch (NumberFormatException e) {
	//se lanza cuando el parámetro sea distinto a una numero
	throw new NumberFormatException("Formato de número incorrecto :" + e.getMessage());
	}
	catch (ArithmeticException e) {
	// se lanzará cuando el parámetro sea un cero
	throw new ArithmeticException("Error en aritmética :" +e.getMessage());
	}
	return resultado;
	}

}
