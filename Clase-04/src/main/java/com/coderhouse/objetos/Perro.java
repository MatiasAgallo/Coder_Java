package com.coderhouse.objetos;

public class Perro {
	
	//Constante
	
	private static final int EDAD_MAXIMA = 16;
	
	String mensajeDeError = "El perro no vive mas de " +  EDAD_MAXIMA +  " anios de edad";

	//Atributos del objeto
	
	String nombre;
	
	String raza;
	
	String color;
	
	String tamanio;
	
	int edad;
	
	//Metodos
	
	public void ladrar() {
		String nombreDelPerro = getNombre();
		System.out.println("El perro de nombre " + nombre + " esta ladrando");
	}
	
	public void comer() {
		System.out.println("El perro esta comiendo");
	}
	
	public void caminar() {
		System.out.println("El perro esta caminando");
	}

	
	
		//Getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception{
		if (edad > EDAD_MAXIMA) {
			throw new Exception (mensajeDeError);
		}else {
			this.edad = edad;
		}
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + ", edad="
				+ edad + "]";
	}
	

}
