package mirando.El.Pasado.models;

public class Marcas {

	private String marca;

	public Marcas() {
		// TODO Auto-generated constructor stub
	}

	public Marcas(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Marcas [marca=" + marca + "]";
	}

}
