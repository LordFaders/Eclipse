package com.desafiolatam.Models;

public class Producto {
	
	private String producto;
	private String descripcion;
	private Integer valorUnitario;
	private String item;
	private Integer valorTotal;
	private Integer cantidad;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String producto, String descripcion, Integer valorUnitario, String item) {
		super();
		this.producto = producto;
		this.descripcion = descripcion;
		this.valorUnitario = valorUnitario;
		this.item = item;
	}

	public Producto(String producto, String descripcion, Integer valorUnitario, Integer valorTotal, Integer cantidad) {
		super();
		this.producto = producto;
		this.descripcion = descripcion;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
		this.cantidad = cantidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Integer valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Integer valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	

}
