package cl.desafiolatamf20220107.models;

public class Parlante {
	private int tamanio;
	private double altura;
	private String marca;
	public Parlante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parlante(int tamanio, double altura, String marca) {
		super();
		this.tamanio = tamanio;
		this.altura = altura;
		this.marca = marca;
	}
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Parlante [tamanio=" + tamanio + ", altura=" + altura + ", marca=" + marca + "]";
	}

}
