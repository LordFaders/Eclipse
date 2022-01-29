package cl.desafiolatanf20210104;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregaElemento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> casa = new ArrayList<String>();
		casa.add("refrigerador");
		casa.add("lavadora");
		casa.add("cocina");
		casa.add("mesa");

		int contador = 0;

		System.out.println("Ingrese un elemento");
		String elemento = sc.nextLine();

		for (int i = 0; i < casa.size(); i++) {
			if (casa.get(i).equalsIgnoreCase(elemento)) {
				contador++;

			}
		}
		if (contador == 0) {
			casa.add(elemento);
		} else {
			System.out.println("Elemento ya existe en la casa");

		}
		System.out.println(casa);
	}

}
