package Supermar.code;
import java.sql.Date;

public class Detalle {
	private String descipcion;
	private Integer cantidad;
	private float descuento;
	public Detalle(String descipcion, Integer cantidad, float descuento) {
		super();
		this.descipcion = descipcion;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	public String getDescipcion() {
		return descipcion;
	}
	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	
}