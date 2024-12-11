package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase04 {

	public static void main(String[] args) throws Exception {
		
		
		
		Perro primerPerro = new Perro();
		
		primerPerro.setNombre("Firulais");
		primerPerro.setEdad(5);
		primerPerro.setColor("Marron");
    	primerPerro.setRaza("Boxer");
		primerPerro.setTamanio("Mediano");
		
		System.out.println(primerPerro);
		
		primerPerro.caminar();
		primerPerro.ladrar();
		primerPerro.comer();
		
		
		String[] nombres = new String[] {
				"Matias",
				"Gustavo",
				"Mariano",
				"Luciano",
				"Luciana"
				
		};
		
		imprimirListaDeNombres(nombres);
		
		int radio = 3;
		
		calcularAreaDeUnCirculo(radio);
		
		System.out.println("El area de un circulo con radio " + radio + "cm, es de " + calcularAreaDeUnCirculo(radio) + "cm");
			
		}
	
	
	private static void imprimirListaDeNombres(String[] nombreDePersonas) {
		for (String nombre : nombreDePersonas) {
			System.out.println("Nombre " + nombre);
		}
		
	}
	
	
		static final double PI;
		
		static {
			
			PI = 3.141592 ;
		}
	
	private static double calcularAreaDeUnCirculo(int radio) {
		
		return PI * Math.pow(radio, 2);
	}
	
	
       

}
