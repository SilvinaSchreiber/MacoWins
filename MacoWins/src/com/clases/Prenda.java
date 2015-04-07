package com.clases;

public class Prenda {
	protected int id;
	protected String descripcion;
	protected double valorFijo = 2;
	protected double precio = 20;
	protected double precioFinal = precio * valorFijo;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecioFinal(){
		return precioFinal;
	}
	
}
