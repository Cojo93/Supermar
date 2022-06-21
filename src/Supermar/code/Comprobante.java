package Supermar.code;

import java.sql.Date;
import java.util.ArrayList;

public class Comprobante {
	private Integer id;
	private Float total;
	private Character tipo;
	private Date fecha;
	private ArrayList<Producto> producto;
	private Cliente destinatario;
	
	
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
	
	public Character getTipo() {
		return tipo;
	}
	
	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public ArrayList<Producto> getProducto() {
		return producto;
	}
	
	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}
	
	
	public Cliente getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(Cliente destinatario) {
		this.destinatario = destinatario;
	}
	
	
	
	

}