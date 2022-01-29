package mirando.El.Pasado.models;

public class Golosinas {

	private String marca;

	public Golosinas() {
	}

	public Golosinas(String marca) {
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
		return "Golosinas [marca=" + marca + "]";
	}

}
