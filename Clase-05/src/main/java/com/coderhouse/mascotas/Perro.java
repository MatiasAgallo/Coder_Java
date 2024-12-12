package com.coderhouse.mascotas;

public class Perro extends Mascotas {
	
	String raza;
	
	@Override
	public void comer() {
		System.out.println("El perro " + getNombre() + " esta comiendo");
	}
	@Override
	public void caminar() {
		System.out.println("El perro " + getNombre() + " esta caminando");
	}
	
	
	
	
	
	public void ladrar() {
		System.out.println("El perro " + getNombre() + " esta ladrando");
	}
	
	
	
	
	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}




//	@Override
//	public String toString() {
//		return "Perro [raza=" + raza + "]";
//	}
//	
	
	
	
	
}
