package Supermar.code;

import java.sql.Date;
public class Producto {
	public Integer id;
	public String nombre;
	public String marca;
	public Date f_vencimiento;
	public double precio;
	public Integer stock;
	
	

	public Producto(Integer id, String nombre, String marca, Date f_vencimiento, double precio, Integer stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.f_vencimiento = f_vencimiento;
		this.precio = precio;
		this.stock = stock;
		
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getF_vencimiento() {
		return f_vencimiento;
	}
	public void setF_vencimiento(Date f_vencimiento) {
		this.f_vencimiento = f_vencimiento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
