package com.coderhouse.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClaseArrays {

	public static void main(String[] args) {
		
//		int[] numerosEnteros = new int [6];
//		
//		numerosEnteros[0] = 10;// guardo en la posicion 0 el numero 10
//		numerosEnteros[1] = 1;
//		numerosEnteros[2] = 0;
//		numerosEnteros[3] = 6;
//		numerosEnteros[4] = 23;
//		numerosEnteros[5] = 11;
//		
//		System.out.println("Posicion de memoria: " + numerosEnteros);
//		
//		System.out.println("El array tiene: "+ numerosEnteros.length + " elementos");
//		
//		System.out.println(Arrays.toString(numerosEnteros));
		
//		String[] palabras = {
//				"hola",
//				"como andas",
//				"hola",
//		};
//		
//		
//		System.out.println(palabras.length);
//		
//		System.out.println(Arrays.toString(palabras));
		
		
		List<String> listaDeNombres = new ArrayList<>();
		List<String> listaDeNombres2 = new ArrayList<>();
		
		listaDeNombres.add("Matias");
		
		listaDeNombres.add("Santiago");
		
		listaDeNombres.add("Martin");
		
		listaDeNombres.add("Agustin");
		
		listaDeNombres2.add("Asi");
		listaDeNombres2.add("Dan");
		listaDeNombres2.add("Man");
		
		listaDeNombres.addAll(listaDeNombres2);
		
		System.out.println(listaDeNombres.size());
		
		System.out.println("La lista listaDeNombres contiene a listaDeNombres2 " + listaDeNombres.containsAll(listaDeNombres2));
		
		listaDeNombres.remove(3);
		
		System.out.println(listaDeNombres.size());
		
		System.out.println(listaDeNombres);
		
		//listaDeNombres.removeAll(listaDeNombres2);	
//		System.out.println("La lista listaDeNombres contiene a listaDeNombres2 " + listaDeNombres.containsAll(listaDeNombres2));
		
//	for(String nombre : listaDeNombres) {
//			
//			System.out.println("Nombre: " + nombre);
//		
//	}
//			for (int i = 0; i < listaDeNombres.size(); i++) {
//			
//			System.out.println("Nombre: " + listaDeNombres.get(i));
//		}
		
		
			//listaDeNombres.clear();
			
			
		if (listaDeNombres.isEmpty()) {
			
			System.out.println("La lista esta vacia");
		}else {
			
			System.out.println(listaDeNombres);
		}
		
		int posicion = 3;
		
//		System.out.println("El nombre con la posicion Nro " + posicion + " es " + listaDeNombres.get(3));
//	
//	listaDeNombres.set(posicion, "Mariano");
//		
//	System.out.println(listaDeNombres);
		
		String nombre = "Matias";
		
		System.out.println("El indice del nombre " + nombre + " es: " + listaDeNombres.indexOf(nombre));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
