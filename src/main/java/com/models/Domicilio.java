package com.models;
import java.sql.Date;
public class Domicilio {
	private Integer id;
	private String calle;
	private Integer numero;
	private Integer departamento;
	private Integer piso;
	
	public Domicilio(Integer id) {
		this.id = id;
	}	
	
	public Domicilio(String calle, Integer numero, Integer departamento, Integer piso) {
		super();
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.departamento = departamento;
		this.piso = piso;
	}
	public Domicilio(String calle, Integer numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}
	public Domicilio(Integer id, String calle, Integer numero, Integer departamento, Integer piso) {
		super();
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.departamento = departamento;
		this.piso = piso;

	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Integer departamento) {
		this.departamento = departamento;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	}
	
	
