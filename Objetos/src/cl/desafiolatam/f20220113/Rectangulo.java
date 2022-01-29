package cl.desafiolatam.f20220113;

public class Rectangulo extends FiguraGeometricaRecta {

	public Rectangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculaArea() {
		System.out.println("El area es: " + (getBase())*getAltura());
		
	}
	
	

}
