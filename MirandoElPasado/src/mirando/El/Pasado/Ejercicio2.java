package mirando.El.Pasado;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {

		Set<String> invitadosTree = new TreeSet<String>();

		invitadosTree.add("Daniel");
		invitadosTree.add("Paola");
		invitadosTree.add("Facundo");
		invitadosTree.add("Pedro");
		invitadosTree.add("Jacinta");
		invitadosTree.add("Florencia");
		invitadosTree.add("Juan Pablo");

		System.out.println("Lista de invitados (ordenada alfabéticamente): \n" + invitadosTree);
		System.out.println();

		Set<String> posiblesInvitadosTree = new TreeSet<String>();
		posiblesInvitadosTree.add("Jorge");
		posiblesInvitadosTree.add("Francisco");
		posiblesInvitadosTree.add("Marcos");
		invitadosTree.addAll(posiblesInvitadosTree);

		System.out.println("Lista con nuevos invitados: \n" + invitadosTree);
		System.out.println();

		System.out.println("Mejor no invitamos a Jorge.");
		invitadosTree.remove("Jorge");
		System.out.println("Lista de invitados definitiva: \n" + invitadosTree);

	}

}
