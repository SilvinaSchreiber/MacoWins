package com.clases;

import java.util.Date;

public class Venta {

	private int id;
	private Prenda prenda;
	private int cantidadPrendas;
	private Date fecha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public int getCantidadPrendas() {
		return cantidadPrendas;
	}

	public void setCantidadPrendas(int cantidadPrendas) {
		this.cantidadPrendas = cantidadPrendas;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public double getPrecioTotalVenta() {
		double precioTotalVenta = prenda.getPrecioFinal() * cantidadPrendas;
		
		return precioTotalVenta;
	}

}
