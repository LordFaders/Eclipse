package modelo;

public class CategoriaCliente {
	private CategoriaEnum categoria;

	public CategoriaCliente() {
		// TODO Auto-generated constructor stub
	}

	public CategoriaCliente(CategoriaEnum categoria) {
		super();
		this.categoria = categoria;
	}

	public CategoriaEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "CategoriaCliente [categoria=" + categoria + "]";
	}

}
