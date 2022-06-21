 package Supermar.code;

 import java.sql.Date;

public class Carrito_compra extends Producto{
	public Integer id;
	public String nombre;
	public double precio;
	public int cantidad;
	
	
	public Carrito_compra(Integer id, String nombre, String marca, Date f_vencimiento, double precio, Integer stock,
			Integer id2, String nombre2, double precio2, int cantidad) {
		super(id, nombre, marca, f_vencimiento, precio, stock);
		id = id2;
		nombre = nombre2;
		precio = precio2;
		this.cantidad = cantidad;
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	

}
