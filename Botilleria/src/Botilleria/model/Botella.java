package Botilleria.model;

public class Botella {
	private String tipoBotella;
	private String marca;
	public Botella() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Botella(String tipoBotella, String marca) {
		super();
		this.tipoBotella = tipoBotella;
		this.marca = marca;
	}
	public String getTipoBotella() {
		return tipoBotella;
	}
	public void setTipoBotella(String tipoBotella) {
		this.tipoBotella = tipoBotella;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Botella [tipoBotella=" + tipoBotella + ", marca=" + marca + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
