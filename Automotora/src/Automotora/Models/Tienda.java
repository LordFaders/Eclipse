package Automotora.Models;

public class Tienda {

	private Cliente cliente;
	private Vendedor vendedor;
	private Vehiculo vehiculo;
	private int stock;
	
	public Tienda() {
		super();	
	}

	public Tienda(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, int stock) {
		super();
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.vehiculo = vehiculo;
		this.stock = stock;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Tienda [cliente=" + cliente + ", vendedor=" + vendedor + ", vehiculo=" + vehiculo + ", stock=" + stock
				+ "]";
	}

	public int existeStock(int numero) {

		int existeStock = 0;
		if (numero == stock) {
		} else if (stock > numero) {
			existeStock = stock - numero;
		} else if (numero > stock) {
			System.out.println("Stock excedido");
		} else {
			existeStock = numero;
		}
		return existeStock;

	}
}
