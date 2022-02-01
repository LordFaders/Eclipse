package pokeModel;

public class Pokemon {
	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private int puntosVida;
	private int danoAtaque;
	private String dibujo;
	
	public Pokemon() {
		// TODO Auto-generated constructor stub
	}

	public Pokemon(int id, String nombre, String descripcion, String tipo, int puntosVida, int danoAtaque,
			String dibujo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.puntosVida = puntosVida;
		this.danoAtaque = danoAtaque;
		this.dibujo = dibujo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDibujo() {
		return dibujo;
	}

	public void setDibujo(String dibujo) {
		this.dibujo = dibujo;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}


	public int getDanoAtaque() {
		return danoAtaque;
	}

	public void setDanoAtaque(int danoAtaque) {
		this.danoAtaque = danoAtaque;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipo=" + tipo
				+ ", puntosVida=" + puntosVida + ", danoAtaque=" + danoAtaque + ", dibujo=" + dibujo + "]";
	}
	
	public void imprime(){
		System.out.println("Pokemon [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipo=" + tipo
				+ ", puntosVida=" + puntosVida + ", danoAtaque=" + danoAtaque + "]");
	}
	
	public int ataca() {
		System.out.println("El pokemon "+nombre+" ha atacado");
		return danoAtaque;
	}
	
	
}


