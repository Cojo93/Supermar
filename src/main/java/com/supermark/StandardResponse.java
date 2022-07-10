package com.supermark;
import com.google.gson.JsonElement;

public class StandardResponse {
	private StatusResponse estado;
	private String mensaje;
	private JsonElement datos;
	
	
	public StandardResponse(StatusResponse status) {
		this.estado = status;
		
	}
	
	public StandardResponse(StatusResponse status, String message) {
		this.estado = status;
		this.mensaje= message;
	}
	public StandardResponse(StatusResponse status, JsonElement data) {
		this.estado = status;
		this.datos = data;

	}

	public StatusResponse getEstado() {
		return estado;
	}

	public void setEstado(StatusResponse estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public JsonElement getDatos() {
		return datos;
	}

	public void setDatos(JsonElement datos) {
		this.datos = datos;
	}
	
	
	
	
}