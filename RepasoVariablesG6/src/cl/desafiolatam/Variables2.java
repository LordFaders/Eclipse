package cl.desafiolatam;

public class Variables2 {

	public static void main(String[] args) {
		
		//primitivos
		//se escriben con minuscula
		//int, long, float, double, boolean, char
		int edad=0;
		System.out.println("numero2");
		
		String texto="null";
		System.out.println(texto);
		
		//concatenacion
		
		//String + String = String
		System.out.println("hola"+"clase");//holaclase
		
		//String + numero = String	
		System.out.println("hola"+1234);//hola1234
		
		//numero + numero + String = String
		System.out.println(1+2+"hola");//3hola
		
		//String + numero + numero = String
		System.out.println("hola"+1+2);//hola12
		System.out.println();
		String resultadoConcatenacion = "hola"+1+2;
		
		int dosNumero =2;//numero
		String dosSimbolo = "2";//Simbolo
		String dosPalabra = "dos";//palabra
		
		//SUbString
		/*String palabraLarga= "electroencefalografista";
		String texto1 = palabraLarga.substring(0,7);//[0,7[ (teoria de conjuntos)
		System.out.println("texto: "+texto1);
		String texto2 = palabraLarga.substring(7,15);
		System.out.println("texto2: "+texto2);
		String texto3 =palabraLarga.substring(7);
		System.out.println("texto3: "+texto3);
		
	    System.out.println(palabraLarga);*/
	    
	    String fecha1= "DD/MM/AAAA";
		String dia1 = fecha1.substring(0,2);//[0,7[ (teoria de conjuntos)
		System.out.println("dia1: "+ dia1);
		String mes1 = fecha1.substring(3,5);
		System.out.println("mes1: "+ mes1);
		String año1 = fecha1.substring(6,10);
		System.out.println("año1: "+ año1);
		
	    System.out.println(fecha1);
	    
	    if(ano1<ano2) {
			System.out.println("La persona 1 es mayor");
		}else if(ano1>ano2) {
			System.out.println("La persona 2 es mayor");
		}else {
			if(mes1<mes2) {
				System.out.println("La persona 1 es mayor");
			}else if(mes1>mes2) {
				System.out.println("La persona 2 es mayor");
			}else {
				if(dia1<dia2) {
					System.out.println("La persona 1 es mayor");
				}else if(dia1>dia2) {
					System.out.println("La persona 2 es mayor");
				}else {
					System.out.println("Tienen la misma edad");
				}
			}	
		}

	}

}
