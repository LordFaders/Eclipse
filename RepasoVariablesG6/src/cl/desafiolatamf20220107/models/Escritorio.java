package cl.desafiolatamf20220107.models;

public class Escritorio {
	private String tamanio;
	private String escritorio;

	public Escritorio() {
		super();
	}

	public Escritorio(String tamanio, String escritorio) {
		super();
		this.tamanio = tamanio;
		this.escritorio = escritorio;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getEscritorio() {
		return escritorio;
	}

	public void setEscritorio(String escritorio) {
		this.escritorio = escritorio;
	}

	@Override
	public String toString() {
		return "Escritorio [tamanio=" + tamanio + ", escritorio=" + escritorio + "]";
	}

}
