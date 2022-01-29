package cl.desafiolatamf20220107.models;

public class Cocina {
	private double altura;
	private int cantidadHornillas;

	public Cocina() {
		super();
	}

	public Cocina(double altura, int cantidadHornillas) {
		super();
		this.altura = altura;
		this.cantidadHornillas = cantidadHornillas;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getCantidadHornillas() {
		return cantidadHornillas;
	}

	public void setCantidadHornillas(int cantidadHornillas) {
		this.cantidadHornillas = cantidadHornillas;
	}

	@Override
	public String toString() {
		return "Cocina [altura=" + altura + ", cantidadHornillas=" + cantidadHornillas + "]";
	}

	public static void prenderHorno() {
	}
}
