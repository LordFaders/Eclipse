package cl.desafiolatanf20210104;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> pizza = new ArrayList<String>();
		pizza.add("masa");
		pizza.add("queso");
		pizza.add("salsa");
		
		int vecesEncontrado = 0;//contador
		boolean existe = false;

		System.out.println("Ingrese un ingrediente");
		String ingrediente = sc.nextLine();// masa

		// recorrer un arreglo dinamico
		for (int i = 0; i < pizza.size(); i++){
			if(pizza.get(i).equalsIgnoreCase(ingrediente)) {
				//System.out.println("Ingrediente ya existe en la pizza");
				vecesEncontrado++;//incrementando en 1
				existe = true;
			}
		}
		System.out.println("vecesEncontrado"+vecesEncontrado);
		
		if(vecesEncontrado == 0) {//if(!existe) {
			pizza.add(ingrediente);
		}else {
			System.out.println("Ingrediente ya existe en la pizza");
			//pizz.clear();// elimina todos los elementos
			//pizza.remove(3);//elimina segun el índice
			//pizza.remove("queso"); //elimina la primera coincidencia
		}
		System.out.println(pizza);
	}
}
