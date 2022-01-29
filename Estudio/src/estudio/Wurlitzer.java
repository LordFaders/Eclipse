package estudio;

import java.util.ArrayList;

public class Wurlitzer {

	public static void main(String[] args) {
		wurlitzer("1");
	}

	public static String wurlitzer(String numero) {
		ArrayList<String> canciones = new ArrayList<String>();
		canciones.add("Yello ledbetter");
		canciones.add("Echoes");
		canciones.add("Tom Sawyer");
		canciones.add("Miño");
		canciones.add("La voz de los 80");
		canciones.add("MIra niñita");
		String cancion = "";
		
		try {
			int indiceCancion = Integer.parseInt(numero);
			if(indiceCancion >= 1) {
				cancion = canciones.get(indiceCancion);
			}
		}
		catch(IndexOutOfBoundsException e) {
			
			throw new IndexOutOfBoundsException("Indice fuera de rango" + e.getMessage());
		}
		catch (NumberFormatException e) {
			throw new NumberFormatException("Formato de números incorrecto" + e.getMessage());
		}
		return cancion;
	}

}
