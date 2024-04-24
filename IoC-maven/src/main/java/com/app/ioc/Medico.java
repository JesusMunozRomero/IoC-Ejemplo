package com.app.ioc;

public class Medico {

	utencilios utencilio;
	
	public void setUtencilio(utencilios utencilio) {
		this.utencilio=utencilio;
	}
	
	public void operar() {
		System.out.println("Operando...");
		utencilio.usar();
	}
}