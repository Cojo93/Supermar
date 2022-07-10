package com.supermark.service;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.models.Domicilio;
import java.sql.Statement;
public class CRUDDomicilio {
	
		private Conexion conexion;
		private String sql;
		
		public CRUDDomicilio () {
			super();
			this.conexion = new Conexion("supermark");
			this.conexion.connect();
			this.sql = "";
			
		}
		public boolean register(Domicilio dom) {
			this.sql = "INSERT INTO domicilio"+
		             "(calle,numero,departamento,piso)"+
					 "VALUE('"+
		             dom.getCalle()+"','"+
					 dom.getNumero()+"','"+
					 dom.getDepartamento()+","+
		             dom.getPiso()+")";
			
			try {
				PreparedStatement stmt = conexion.getConn().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				int filas = stmt.executeUpdate();
				if(filas>0) {
					ResultSet rs = stmt.getGeneratedKeys();
					while(rs.next()) {
						dom.setId(rs.getInt(1));
					}
				}
				System.out.println("Domicilio registrado");
			} catch (SQLException e) {
				e.printStackTrace();		
		}
           return dom != null;
		}
		
	public Domicilio getDomcicilio(Integer id) {
		this.sql = "SELECT calle,numero.departamento,piso FROM domicilio" +
                   "WHERE domicilio.id="+id;
		Domicilio dom = null;
		try {
			conexion.setRs(conexion.getStmt().executeQuery(sql));
			dom = new Domicilio(
					id,
					conexion.getRs().getString("calle"),
					conexion.getRs().getInt("numero"),
					conexion.getRs().getInt("departamento"),
					conexion.getRs().getInt("piso"));
		} catch (SQLException e) {
			e.printStackTrace();		
	}
		return dom;

}
}