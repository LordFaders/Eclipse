package estudio;

import java.util.ArrayList;
import java.util.Iterator;

public class cocina {

	public static void agregarElemento(String nuevoElemento) {
		// TODO Auto-generated method stub
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("mesa");
		elementos.add("Refrigerador");
		elementos.add("Cocina");
		elementos.add("lavadora");
		// Paso 3
		for (Iterator<String> iterator = elementos.iterator();
		iterator.hasNext();) {
		String element = (String) iterator.next();
		// Paso 4
		if(element.contains(nuevoElemento)) {
		System.out.println("Elemento ya existe");
		}
		else {
		elementos.add(nuevoElemento);
		}
		}
	}

}
