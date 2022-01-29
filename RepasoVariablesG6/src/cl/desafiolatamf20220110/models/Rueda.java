package cl.desafiolatamf20220110.models;

public class Rueda {
	private String perfil;
	private String tamanho;
	private String marca;
	public Rueda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Rueda(String perfil, String tamanho, String marca) {
		super();
		this.perfil = perfil;
		this.tamanho = tamanho;
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Rueda [perfil=" + perfil + ", tamanho=" + tamanho + ", marca=" + marca + "]";
	}
	
	

}
