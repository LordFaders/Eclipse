package cl.desafiolatamf20220107.models;

public class Guitarra {
	private String tipoMastil;
	private String marca;
	public Guitarra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Guitarra(String tipoMastil, String marca) {
		super();
		this.tipoMastil = tipoMastil;
		this.marca = marca;
	}
	public String getTipoMastil() {
		return tipoMastil;
	}
	public void setTipoMastil(String tipoMastil) {
		this.tipoMastil = tipoMastil;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Guitarra [tipoMastil=" + tipoMastil + ", marca=" + marca + "]";
	}

}
