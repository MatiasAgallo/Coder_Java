package com.coderhouse.entidades;

import com.coderhouse.interfaces.SerVivoInterface;

public class Ave implements SerVivoInterface {
	
	private String nombre;//Hay que hacerlo porque no tiene nombre y no hereda de Animal y hacer los getters y setters
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void emitirSonido() {
		
		System.out.println(getNombre() + " esta cacareando");
		
	}

	@Override
	public void moverse() {
		
		System.out.println(getNombre() + " esta volando");
		
	}

	@Override
	public void comer() {
		
		System.out.println(getNombre() + " esta comiendo");
		
	}

	@Override
	public boolean estaVivo() {
		return true;
	}

}
