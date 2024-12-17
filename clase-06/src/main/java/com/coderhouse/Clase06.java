package com.coderhouse;

import com.coderhouse.entidades.Auto;
import com.coderhouse.entidades.Ave;
import com.coderhouse.entidades.Gato;
import com.coderhouse.entidades.Perro;
import com.coderhouse.interfaces.SerVivoInterface;
import com.coderhouse.sobrecarga.Impresora;

public class Clase06 {

	public static void main(String[] args) {
	
		
//		Perro miPerro = new Perro();
//		
//		miPerro.setNombre("Firulais");
//		
//		miPerro.comer();
//		
//		miPerro.emitirSonido();
//		
//		miPerro.estaVivo();
//		
//		miPerro.jugar();
//		
//		System.out.println("Mi perro " + miPerro.getNombre() + " esta vivo? " + miPerro.estaVivo());
//		
//		System.out.println("La ubicacion de " + miPerro.getNombre() + " es en " + SerVivoInterface.UBICACION);
//		
//		Gato miGato = new Gato();
//		
//		miGato.setNombre("Michi");
//		
//		miGato.emitirSonido();
//		
//		miGato.jugar();
//		
//		Ave miAve = new Ave();
//		
//		miAve.setNombre("Tweety");
//		
//		miAve.moverse();
//		
//		miAve.emitirSonido();
		
//		Auto miAuto = new Auto();
//		
//		miAuto.setMarca("Ford");
//		
//		miAuto.setModelo("Fiesta");
//		
//		miAuto.setRuedas(4);
//		
//		miAuto.mostarCantidadDeRuedas();
//		
//		miAuto.setColor("Azul");
//
//		System.out.println(miAuto);
//		
		
		Impresora miImpresora = new Impresora();
		
		miImpresora.imprimir(4);
		
		miImpresora.imprimir(10, 20);
		
		miImpresora.imprimir("Programar");
		
		miImpresora.imprimir("Programar", "Divierte");
		
		int[] enteros = {1,2,3,4,5,9,11,22};
		
		miImpresora.imprimir(enteros);

	}

}
