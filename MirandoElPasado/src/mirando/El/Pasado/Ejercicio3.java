package mirando.El.Pasado;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {

	public static void main(String[] args) {

		Map<Integer, String> marcaGolosinas = new TreeMap<Integer, String>();
		marcaGolosinas.put(100, "Chocman");
		marcaGolosinas.put(100, "Trululú");
		marcaGolosinas.put(100, "Centella");
		marcaGolosinas.put(50, "Kilate");
		marcaGolosinas.put(30, "Miti-miti");
		marcaGolosinas.put(150, "Traga Traga");
		marcaGolosinas.put(5, "Tabletón");

		for (Iterator iterator2 = marcaGolosinas.keySet().iterator(); iterator2.hasNext();) {
			Integer precio2 = (Integer) iterator2.next();
			String marca2 = marcaGolosinas.get(precio2);
			if (precio2 < 100) {
				System.out.println("Golosinas menores a $100: " + marca2 + " " + "$" + precio2);
			}

		}
	}
}
