package com.supermark.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.models.CarritoCompra;
import com.models.Detalle;
import com.models.Producto;
import com.models.Usuario;
public class CRUDCarrito {
	private Conexion conexion;
	private String sql;
	
	public CRUDCarrito() {
		super();
		this.conexion = new Conexion("Supermark");
		this.conexion.connect();//Abre la conexion
		this.sql = "";
	}
	
	public boolean agregar(CarritoCompra carrito) {//-->Registrar un producto en el carrito
		boolean resultado = false;
		if(getListado(carrito.getUsuario()).size()<30) {
			
			this.sql = "INSERT INTO Carrito "+
					"(id_usuario,id_producto,cantidad) "+
					"VALUE ("+
					carrito.getUsuario().getId()+","+
					carrito.getProducto().getId()+","+
					carrito.getCantidad()+")";
			
			try {
				int filas = conexion.getStmt().executeUpdate(sql);
				if(filas>0){
					resultado = true;
				}
				System.out.println("Producto agregado al Carrito");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("El carrito esta lleno");
		}
		
		return resultado;
	}
	
	public ArrayList<Detalle> getListado(Usuario usuario){
		ArrayList<Detalle> detalles = new ArrayList<Detalle>();
		
		this.sql = "SELECT Producto.nombre,Carrito.id_producto,Carrito.cantidad,Producto.precio FROM Carrito "+
					"JOIN producto ON producto.id = carrito.id_producto "+
					"WHERE id_usuario = "+usuario.getId();
		
		try {
			ResultSet rs = conexion.getStmt().executeQuery(sql);
			while(rs.next()) {
				int id_producto = rs.getInt("id_producto");
				int cantidad = rs.getInt("cantidad");
				String nombre = rs.getString("nombre");
				float precio = rs.getFloat("precio");
				detalles.add(new Detalle(
							new Producto(id_producto,nombre,precio),
							cantidad
						));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return detalles;
	}
	
	public boolean vaciar(Usuario usuario){
		boolean resultado = false;
		this.sql = "DELETE FROM Carrito WHERE id_usuario = "+usuario.getId();
		
		try {
			int filas = conexion.getStmt().executeUpdate(sql);
			if(filas>0) {
				resultado = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

}
