package operandoConArreglos;

import java.util.ArrayList;
import java.util.Collections;

public class Visitas {

	public static void main(String[] args) {
		float promedio = promedio(args);
		System.out.println("Para la entrada anterior, el resultado es: " + promedio);

	}

	public static float promedio(String[] args) {
		
		ArrayList<Integer> visitas = new ArrayList<Integer>();
		Collections.addAll(visitas);
		int sumaTotal = 0;
		for (int i = 0; i < args.length; i++) {
			sumaTotal = sumaTotal + Integer.parseInt(args[i]);
		}
		System.out.println(sumaTotal);
		// promedio = sumaTotal / cantidadElementos;
		float promedio = sumaTotal / args.length;
		return promedio;

	}
}