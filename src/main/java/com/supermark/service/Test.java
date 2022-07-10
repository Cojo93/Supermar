package com.supermark.service;

import java.util.ArrayList;

import com.models.Comprobante;
import com.models.Detalle;
import com.models.Tarjeta;
import com.models.Usuario;

public class Test {
	public static void main(String[] args) {
		CRUDCarrito ccarr = new CRUDCarrito();
		ArrayList<Detalle> detalles = ccarr.getListado(new Usuario(1));
		
		for(Detalle detalle:detalles) {
			System.out.println(detalle);
		}
		CRUDComprobante cc = new CRUDComprobante();
		cc.registrarCompra(new Comprobante(
					"C",
					new Usuario(1),
					new Tarjeta(123456)
				));
	}
}
