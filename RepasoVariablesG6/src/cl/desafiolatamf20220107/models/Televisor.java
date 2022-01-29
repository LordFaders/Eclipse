package cl.desafiolatamf20220107.models;

public class Televisor {
	private String marca;
	private String definicion;

	public Televisor() {
		super();
	}

	public Televisor(String marca, String definicion) {
		super();
		this.marca = marca;
		this.definicion = definicion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	@Override
	public String toString() {
		return "Televisor [marca=" + marca + ", definicion=" + definicion + "]";
	}

	public static void apagarTelevisor() {
	}
}
