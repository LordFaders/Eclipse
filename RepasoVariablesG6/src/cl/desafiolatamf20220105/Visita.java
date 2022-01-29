package cl.desafiolatamf20220105;

public class Visita {

	public static void main(String[] args) {
		float promedio = promedio(args);
		System.out.println("Para la entrada anterior, el resultado es: " + promedio);

	}
	
	public static float promedio(String[]args) {
		int sumaTotal = 0;//variable + algo;
		for (int i = 0; i < args.length; i++) {
			sumaTotal = sumaTotal + Integer.parseInt(args[i]);
			
		}
		System.out.println(sumaTotal);
		//promedio = sumaTotal / cantidadElementos;
		float promedio = sumaTotal / args.length;
		return promedio;
	}

}
