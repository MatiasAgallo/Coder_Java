package com.coderhouse;

public class Clase02 {

	public static void main(String[] args) {
		
		//int numeroA = 1;
		
		//int numeroB = 2;
		
		
		//if (numeroA > numeroB) {
		//	System.out.println("El numero " + numeroA + " es mayor que el " + numeroB );
		//}// else {
			
			//System.out.println("El numero " + numeroA + " es menor que el " + numeroB);
		//}
		
		//Calculadora
		
//		float numeroA = 1.5f;
//		
//		float numeroB = 2.6f;
//		
//		float resultado = numeroA / numeroB;
//		
//		if (numeroB != 0) {
//			
//			System.out.println("El resultado es " + resultado);
//			
//		}else {
//			
//			System.out.println("No se puede dividor por 0");
//		}
		
		
		
		
//		int diaDeLaSemana = 5;
//		
//		if (diaDeLaSemana == 1) {
//			
//			System.out.println("El dia es un lunes");
//		} else if (diaDeLaSemana == 2) {
//			
//			System.out.println("El dia es un martes");
//		}else if (diaDeLaSemana == 3) {
//			
//			System.out.println("El dia es un miercoles");
//		}else if (diaDeLaSemana == 4) {
//			System.out.println("El dia es un jueves");
//		}else if (diaDeLaSemana == 5) {
//			System.out.println("El dia es un viernes");
//		}else if (diaDeLaSemana == 6) {
//			System.out.println("El dia es un sabado");
//		}else if (diaDeLaSemana == 7) {
//			System.out.println("El dia es un domingo");
//		}else {
//			System.out.println("El dia es incorrecto");
//		}
		
		
		
//		int ingreseSuEdad = 170;
//		
//		
//		if (ingreseSuEdad >= 18 && ingreseSuEdad <= 110) {
//			
//			System.out.println("Usted puede ingresar");
//			
//		}else if (ingreseSuEdad > 0 && ingreseSuEdad < 18) {
//			
//			System.out.println("Usted es menor de edad, no puede ingresar");
//		} else {
//			
//			System.out.println("Ingrese una edad correcta");
//		}
//		
		
//		int diaDeLaSemana = 5;
//		
//		String nombreDiaDeLaSemana = null;
//		
//		switch(diaDeLaSemana) {
//		
//		case 1 :
//			nombreDiaDeLaSemana = "Lunes";
//			break;		
//			
//		case 2 :
//			nombreDiaDeLaSemana = "Martes";
//			break;		
//		case 3 :
//			nombreDiaDeLaSemana = "Miercoles";
//			break;		
//		case 4 :
//			nombreDiaDeLaSemana = "Jueves";
//			break;		
//		case 5 :
//			nombreDiaDeLaSemana = "Viernes";
//			break;		
//		case 6 :
//			nombreDiaDeLaSemana = "Sabado";
//			break;		
//		case 7 :
//			nombreDiaDeLaSemana = "Domingo";
//			break;		
//			
//		default :
//			nombreDiaDeLaSemana = "Dia Incorrecto";
//			break;
//				
//		}
//		
//		System.out.println("El dia correspondiente al numero "+ diaDeLaSemana + " es el "+ nombreDiaDeLaSemana);
//		
		
//		String dia = "Domingo";
		
//		switch(dia.toLowerCase()) {
//		
//		case "lunes" :
//			
//			System.out.println("El dia es "+ dia);
//			break;
//		case "martes" :
//			
//			System.out.println("El dia es "+ dia);
//			break;
//		case "miercoles" :
//	
//			System.out.println("El dia es "+ dia);
//			break;
//		case "jueves" :
//	
//			System.out.println("El dia es "+ dia);
//			break;
//		case "viernes" :
//	
//			System.out.println("El dia es "+ dia);
//			break;
//		case "sabado" :
//		
//			System.out.println("El dia es "+ dia);
//			break;
//		case "domingo" :
//	
//			System.out.println("El dia es "+ dia);
//			break;
//			
//			default :
//				System.out.println("El dia ingresado fue " + dia + " es incorrecto");
//				break;
//		
//		}
		
		
		
		
		//Operador ternario
		
//		int numeroA = 5;
//				
//		int numeroB = 2;
//		
//		boolean condicion = numeroA > numeroB;
//		
////		boolean resultado = condicion ? true:false;
//		
//		String resultado = condicion 
//				? "El numero " + numeroA + " es mayor que el " + numeroB 
//				: "El numero " + numeroA + " es menor que el " + numeroB;
//		
//		System.out.println(resultado);
		
		
		//Datos Aleatorios
		
		int randon = 0;
		
		//randon = Math.random(); //nunca mayor que 1, siempre entre 0 y 1
		
		
		//System.out.println(randon);
		
		
		int minimo = 1;
		int maximo = 6;
		
		int rango = maximo - minimo + 1;
		
		randon = ( int ) (Math.random()* rango) + minimo;
		
		System.out.println(randon);
		
		final double PI = Math.PI;
		//System.out.println(PI);
		
		System.out.println(String.format("%.2f", PI));
	
		
		
		
		

	}

}
