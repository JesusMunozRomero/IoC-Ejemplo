package com.app.ioc2;

public class UsuarioFactory {

	
	public void getIsertaUsuario() {
		System.out.println("Insertando usuario con Oracle");
	}
	
	public void getEliminarUsuarioByID(int id) {
		System.out.println("Eliminando usuario con Oracle :"+id);
	}
}
