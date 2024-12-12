package com.coderhouse;

import com.coderhouse.mascotas.Perro;

public class Clase05 {

	public static void main(String[] args) throws PerroException {
		
		
		Perro unPerro = new Perro();
		
	
		unPerro.setNombre("Firulais");
		unPerro.setColor("Marron");
		unPerro.setTamanio("Mediano");
		try {
			unPerro.setEdad(14);
		}catch(PerroException err) {
			System.err.println("Error, " + err.getMessage());
		}finally {
			
			System.out.println("Finalizo la validacion de edad");
		}
		unPerro.setRaza("Boxer");
		unPerro.ladrar();
		unPerro.caminar();
		unPerro.comer();
		System.out.println(unPerro);
	}

}
