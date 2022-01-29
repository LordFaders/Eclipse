package cl.desafiolatam.f20220113;

public abstract class FiguraGeometricaRecta {
	
	
	
	private int base;
	private int altura;
	public FiguraGeometricaRecta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FiguraGeometricaRecta(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "FiguraGeometricaRecta [base=" + base + ", altura=" + altura + ", toString()=" + super.toString() + "]";
	}
	
	public abstract void calculaArea(); {
		
	}

}
