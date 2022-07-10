package com.models;

import java.sql.Date;
import java.util.ArrayList;
import java.sql.Timestamp;

public class Comprobante {
	private Integer id;
	private Float total;
	private String tipo;
	private Timestamp fecha;
	private ArrayList<Detalle> detalles;
	private Usuario destinatario;
	private Tarjeta tarjeta;
	
	public Comprobante() {
		super();
	}
	
	public Comprobante(String tipo,Usuario destinatario,
			Tarjeta tarjeta) {
		super();
		this.tipo = tipo;
		this.fecha = new Timestamp(System.currentTimeMillis());
		this.destinatario = destinatario;
		this.tarjeta = tarjeta;
	}
	
	public Comprobante(String tipo,ArrayList<Detalle> detalles,
			Usuario destinatario, Tarjeta tarjeta) {
		super();
		this.tipo = tipo;
		this.fecha = new Timestamp(System.currentTimeMillis());
		this.detalles = detalles;
		this.destinatario = destinatario;
		this.tarjeta = tarjeta;
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Timestamp getFecha() {
		return fecha;
	}
	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}
	
	public ArrayList<Detalle> getDetalles() {
		return detalles;
	}
	
	public Usuario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Usuario destinatario) {
		this.destinatario = destinatario;
	}
	
	public void setDetalles(ArrayList<Detalle> detalles) {
		this.detalles = detalles;
	}
	
	
	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		String comprobante = "";
		comprobante += "Comprobante [id=" + id + ", total=" + total + ", tipo=" + tipo + ", fecha=" + fecha + ", destinatario=" + destinatario +", detalles={";
		for(Detalle clave:detalles) {
			comprobante += "\n Producto: "+clave.getProducto();
		}
		comprobante += "} ]";
		return comprobante;
	}
	
	
}