package operandoConArreglos;

import java.util.ArrayList;
import java.util.Collections;

public class SmartWatch {

	public static void main(String[] args) {
		clearSteps(args);
	}
	public static void clearSteps(String[] filtrapasos) {
		
		ArrayList<String> pasos= new ArrayList<String>();
		Collections.addAll(pasos, filtrapasos);
		System.out.println("Pasos registrados por Smartwatch: "+pasos);
		ArrayList<Integer> pasos_filtrados= new ArrayList<Integer>();
		
		int paso_numerico;
		int contador=0;
		int suma=0;
		
		for (int i=0; i<pasos.size(); i++) {
			String paso=pasos.get(i);
			paso_numerico = Integer.parseInt(paso);
			
			if (paso_numerico>200 && paso_numerico<100000) {
				pasos_filtrados.add(paso_numerico);
			}
		} 			
		
		for (int i=0; i<pasos_filtrados.size();i++) {
			suma=suma+pasos_filtrados.get(i);
			contador++;
		}
		float promedio=suma/contador;
		System.out.println("El promedio de pasos es: "+promedio);
		
		
	}

}
