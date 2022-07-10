package com.models;
import java.sql.Date;

public class Medio_pago {
	private Integer id;
	private Float totalApagar;
	private Double efectivo;
	private Integer tarjeta;
	
	public Medio_pago(Integer id, Float totalApagar, Double efectivo, Integer tarjeta) {
		super();
		this.id = id;
		this.totalApagar = totalApagar;
		this.efectivo = efectivo;
		this.tarjeta = tarjeta;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getTotalApagar() {
		return totalApagar;
	}
	public void setTotalApagar(Float totalApagar) {
		this.totalApagar = totalApagar;
	}
	public Double getEfectivo() {
		return efectivo;
	}
	public void setEfectivo(Double efectivo) {
		this.efectivo = efectivo;
	}
	public Integer getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Integer tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
	
	

}
