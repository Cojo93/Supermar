package com.supermark.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.models.Usuario;
import com.models.Domicilio;

public class CRUDUsuario {
	private Conexion conexion;
	private String sql;
	
	public CRUDUsuario() {
		super();
		this.conexion = new Conexion("supermark");
		this.conexion.connect(); //Abre la conexion
		this.sql = "";
		
	}
	public boolean esAdmin(Usuario usuario) {
		this.sql = "SELECT rol FROM Usuario WHERE id="+usuario.getId();
		boolean resultado = false;
		try {
			ResultSet rs = conexion.getStmt().executeQuery(sql);
			if(rs.getInt("rol")==1) {//si es admin
				resultado = true;
			}
			System.out.println("Usuario registrado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	public boolean registrar(Usuario usuario) {//--> Registrar un usuario
		CRUDDomicilio cdom = new CRUDDomicilio();
		Domicilio dom = cdom.register(usuario.getDomicilio());
		usuario.setDomicilio(dom);
		if(cdom.register(usuario.getDomicilio())) {
			this.sql = "INSERT INTO usuario"+
					"(nombre,apellido,email,dni,contrasenia,id_domicilio) "+
					"VALUE ('"+
					usuario.getNombre()+"','"+
					usuario.getApellido()+"','"+
					usuario.getEmail()+"',"+
					usuario.getDni()+",'"+
					usuario.getContrasenia()+"',"+
					usuario.getDomicilio().getId()+")";
			
			boolean resultado = false;
			try {
				conexion.getStmt().executeUpdate(sql);
				resultado = true;
				System.out.println("Usuario registrado");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return resultado;
		}
	}
	
	public ArrayList<Usuario> consultarUsuario(){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		this.sql = "SELECT * FROM usuario";
		try {
			conexion.setRs(conexion.getStmt().executeQuery(sql));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Usuario Registrado en supermark:");
			ResultSet rs = conexion.getRs();
			try {
				
				while (rs.next()) {//Mientras exista un fila siguiente/Elementos en el conjunto
					CRUDDomicilio cdom = new CRUDDomicilio();
					Domicilio dom = cdom.getDomcicilio(rs.getInt("id_domicilio"));
					if(dom!=null) {
						Usuario user = new Usuario(
								rs.getString("nombre"),
								rs.getString("apellido"),
								rs.getString("email"),
								rs.getInt("dni"),
								rs.getString("contrasenia"),
								dom
								);
						usuarios.add(user);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			} 
		}
		return usuarios;
	}
		public boolean estaRegistrado(Usuario user) {
			this.sql = "SELECT * FROM usuario WHERE usuario.email='"+user.getEmail()+"'";
			boolean resultado = false;
			try {
				conexion.setRs(conexion.getStmt().executeQuery(sql));
				while(conexion.getRs().next()) {
					resultado = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return resultado;
		}
		
		public boolean iniciarSesion(Usuario user) {
			this.sql = "SELECT * FROM usuario WHERE usuario.email='"+user.getEmail()+
					"' AND usuario.contrasenia = '"+user.getContrasenia()+"'";
			boolean resultado = false;
			try {
				conexion.setRs(conexion.getStmt().executeQuery(sql));
				while(conexion.getRs().next()) {
					resultado = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return resultado;
		}	
	}
	

