package com.models;

import java.sql.Date;
import java.util.ArrayList;

public class Factura extends Comprobante {

	private Usuario usuario;
	private Domicilio domicilio;
	private Detalle detalle;
	
	
	public Factura(Usuario usuario, Domicilio domicilio, Detalle detalle) {
		super();
		this.usuario = usuario;
		this.domicilio = domicilio;
		this.detalle = detalle;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Domicilio getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}


	public Detalle getDetalle() {
		return detalle;
	}


	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
	
	
	
	
	

	

}
