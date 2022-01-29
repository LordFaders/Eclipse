package cl.desafiolatam;

import java.util.Calendar;
import java.util.Scanner;

public class TesteandoTiposDeDatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer dia = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		switch (dia) {
		    case 1:
		        System.out.println("Domingo");
		        break;
		    case 2:
		        System.out.println("Lunes");
		        break;
		    case 3:
		        System.out.println("Martes");
		        break;
		    case 4:
		        System.out.println("Miercoles");
		        break;
		    case 5:
		        System.out.println("Jueves");
		        break;
		    case 6:
		        System.out.println("Viernes");
		        break;
		    case 7:
		        System.out.println("Sabado");
		        break;
		    // default: es opcional
		}
	}
}
