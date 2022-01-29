package estudio;

import java.util.ArrayList;

public class Nombres {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Juan");
		 System.out.println(nombres);
		 
		 nombres.clear();
		 System.out.println("Valores en el arreglo:" + nombres);

		 
		 ArrayList<String> nombres2 = new ArrayList<String>();
			nombres2.add("Juan");
			nombres2.add("Pedro");
			nombres2.add("Luis");
			System.out.println(nombres2);
			 
			 nombres2.remove(1);
			 System.out.println(nombres2);
			 
			 
			 
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		
		System.out.println(a);
		
		String borrado = a.remove(1);
		
		System.out.println(a);
		System.out.println("Elemento borrado: " + borrado);
		
		a.remove("a");
		System.out.println(a);
		
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("a");
		b.add("b");
		b.add("c");
		b.add("c");
		b.add("c");
		b.add("c");
		b.add("a");
		System.out.println(b);
		b.remove("c");
		System.out.println(b);
		
		
		ArrayList<String> c = new ArrayList<String>();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("c");
		c.add("c");
		c.add("c");
		c.add("a");
		c.add("d");
		System.out.println(c);
		
		ArrayList<String> elementosABorrar = new ArrayList<String>();
		elementosABorrar.add("a");
		elementosABorrar.add("c");
		c.removeAll(elementosABorrar);
		System.out.println(c);
		
	}

}
